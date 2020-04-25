package com.hik.mw.model;

import javax.validation.constraints.NotNull;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class QapResponse {

	@NotNull
	private String code;

	@NotNull
	private String msg;

	private EventsPageInfo data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public EventsPageInfo getData() {
		return data;
	}

	public void setData(EventsPageInfo data) {
		this.data = data;
	}

}
