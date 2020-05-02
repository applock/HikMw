package com.hik.mw.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hik.mw.model.FaceOrderRequest;
import com.hik.mw.model.QapRequest;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;

@RestController
public class RestApiController {

	@Value("${hikvision.appKey}")
	private String APP_KEY;

	@Value("${hikvision.appSecret}")
	private String APP_SECRET;

	@Value("${hikvision.artemisPath}")
	private String ARTEMIS_PATH;

	@Value("${hikvision.faceorder.host}")
	private String FACEORDER_HOST;

	@Value("${hikvision.faceorder.port}")
	private String FACEORDER_PORT;

	@Value("${hikvision.faceorder.url}")
	private String FACEORDER_URL;

	@Value("${hikvision.qap.host}")
	private String QAP_HOST;

	@Value("${hikvision.qap.port}")
	private String QAP_PORT;

	@Value("${hikvision.qap.url}")
	private String QAP_URL;

	@Value("${hikvision.httpOrHttps}")
	private String PROTOCOL;

	private static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	/**
	 * Calls HIKvision orderWithFace api.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping("/acs/v1/orderWithFace")
	public ResponseEntity<?> orderWithFace(@RequestBody @Valid FaceOrderRequest request) {
		logger.debug("Starting FaceOrderRequest - " + request);

		final String url = ARTEMIS_PATH + FACEORDER_URL;
		logger.debug("FaceOrder Url Path - " + url);
		logger.debug("FaceOrder Url Protocol - " + PROTOCOL);

		Map<String, String> path = new HashMap<String, String>(2) {
			private static final long serialVersionUID = 1L;
			{
				put(PROTOCOL + "://", url);
			}
		};

		JSONObject jsonBody = new JSONObject();
		jsonBody.put("personType", request.getPersonType().toString());
		jsonBody.put("visitorName", request.getVisitorName());
		jsonBody.put("contractName", request.getContractName());
		jsonBody.put("certificateType", request.getCertificateType());
		jsonBody.put("certificateNo", request.getCertificateNo());
		jsonBody.put("birthday", request.getBirthday());
		jsonBody.put("designation", request.getDesignation());
		jsonBody.put("partialId", request.getPartialId());
		jsonBody.put("plateNo", request.getPlateNo());
		jsonBody.put("hostName", request.getHostName());
		jsonBody.put("nationality", request.getNationality());
		jsonBody.put("packageName", request.getPackageName());
		jsonBody.put("gender", request.getGender());
		jsonBody.put("deliveryType", request.getDeliveryType());
		jsonBody.put("email", request.getEmail());
		jsonBody.put("workPermit", request.getWorkPermit());
		jsonBody.put("phoneNo", request.getPhoneNo());
		jsonBody.put("visitPurpose", request.getVisitPurpose());
		jsonBody.put("visitStartTime", request.getVisitStartTime());
		jsonBody.put("visitEndTime", request.getVisitEndTime());
		jsonBody.put("visitorPhoto", request.getVisitorPhoto());
		jsonBody.put("privilegeGroupIds", request.getPrivilegeGroupIds());
		jsonBody.put("cardNo", request.getCardNo());

		String body = jsonBody.toJSONString();
		logger.debug("FaceOrderApi body - " + body);

		String FACEORDER_HOST_PORT = FACEORDER_HOST + ":" + FACEORDER_PORT;

		ArtemisConfig config = new ArtemisConfig();
		config.setHost(FACEORDER_HOST_PORT);
		config.setAppKey(APP_KEY);
		config.setAppSecret(APP_SECRET);

		try {
			String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, "application/json", null);
			logger.debug("FaceOrder Response - " + result);
			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("FaceOrder Response Exception - " + e.getMessage());
			return new ResponseEntity<String>("Service unavailable. Please try after sometime.",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Calls HIKvision events api.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping("/acs/v1/door/events")
	public ResponseEntity<?> qap(@RequestBody @Valid QapRequest request) {
		logger.debug("Starting QapRequest - " + request);

		final String url = ARTEMIS_PATH + QAP_URL;
		logger.debug("Qap Url Path - " + url);
		logger.debug("Qap Url Protocol - " + PROTOCOL);

		Map<String, String> path = new HashMap<String, String>(2) {
			private static final long serialVersionUID = 2L;
			{
				put(PROTOCOL + "://", url);
			}
		};

		JSONObject jsonBody = new JSONObject();
		jsonBody.put("startTime", request.getStartTime());
		jsonBody.put("endTime", request.getEndTime());
		jsonBody.put("pageNo", request.getPageNo());
		jsonBody.put("pageSize", request.getPageSize());
		String body = jsonBody.toJSONString();
		logger.debug("Qap eventsApi body - " + body);

		String QAP_HOST_PORT = QAP_HOST + ":" + QAP_PORT;

		ArtemisConfig config = new ArtemisConfig();
		config.setHost(QAP_HOST_PORT);
		config.setAppKey(APP_KEY);
		config.setAppSecret(APP_SECRET);

		try {
			String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, "application/json", null);
			logger.debug("Qap Response - " + result);
			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Qap Response Exception - " + e.getMessage());
			return new ResponseEntity<String>("Service unavailable. Please try after sometime.",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
