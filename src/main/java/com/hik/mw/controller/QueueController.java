package com.hik.mw.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hik.mw.model.EventsRequest;
import com.hik.mw.model.QueuePayloadRequest;

@RestController
public class QueueController {

	private static final Logger logger = LoggerFactory.getLogger(QueueController.class);

	@PostMapping("/acs/v1/queues")
	public ResponseEntity<?> queryQueues(@RequestBody @Valid EventsRequest request) {
		logger.debug("Starting queryQueues - " + request);

		return null;
	}
	
	@PostMapping("/acs/v1/qpayload")
	public ResponseEntity<?> postToQueue(@RequestBody @Valid QueuePayloadRequest request) {
		logger.debug("Starting postToQueue - " + request);

		return null;
	}
}
