package com.hik.mw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hik.mw.model.FaceOrderRequest;
import com.hik.mw.model.FaceOrderResponse;
import com.hik.mw.model.QapRequest;
import com.hik.mw.model.QapResponse;

@RestController
public class RestApiController {

	@Value("${hikvision.appKey}")
	private String APP_KEY;
	
	@Value("${hikvision.appSecret}")
	private String APP_SECRET;
	
	@Value("${hikvision.faceorder.host}")
	private String FACEORDER_HOST;

	@Value("${hikvision.faceorder.port}")
	private String FACEORDER_PORT;
	
	@Value("${hikvision.qap.host}")
	private String QAP_HOST;

	@Value("${hikvision.qap.port}")
	private String QAP_PORT;

	@PostMapping("/acs/v1/orderWithFace")
	public ResponseEntity<?> orderWithFace(@RequestBody @Valid FaceOrderRequest body) {
		System.out.println("Request - " + body);
		String url = "https://" + FACEORDER_HOST + ":" + FACEORDER_PORT;
		System.out.println("Face order Url - " + url);

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("appKey", APP_KEY);
		headers.set("appSecret", APP_SECRET);
		HttpEntity<FaceOrderRequest> entity = new HttpEntity<FaceOrderRequest>(body, headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		System.out.println("Face order Response - " + response);
		return response;
	}
	
	@PostMapping("/acs/v1/door/events")
	public ResponseEntity<?> qap(@RequestBody @Valid QapRequest body) {
		System.out.println("Request - " + body);
		String url = "https://" + QAP_HOST + ":" + QAP_PORT;
		System.out.println("Qap Url - " + url);

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("appKey", APP_KEY);
		headers.set("appSecret", APP_SECRET);
		HttpEntity<QapRequest> entity = new HttpEntity<QapRequest>(body, headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		System.out.println("Qap Response - " + response);
		return response;
	}

}
