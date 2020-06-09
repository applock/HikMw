package com.hik.mw.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EventsRequest {

	private String code;
	private String msg;
	private Data data;

	@Override
	public String toString() {
		return "EventsRequest [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}

@NoArgsConstructor
@Getter
@Setter
class Data {
	private String host;
	private String clientId;
	private String userName;
	private String password;
	private Object topicName;

	@Override
	public String toString() {
		return "Data [host=" + host + ", clientId=" + clientId + ", userName=" + userName + ", password=" + password
				+ ", topicName=" + topicName + "]";
	}

}
