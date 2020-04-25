package com.hik.mw.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.annotation.Generated;

@Getter
@Setter
@NoArgsConstructor
public class FaceOrderResponse {

	@NotNull
	private String code;

	@NotNull
	private String msg;

	@NotNull
	private String appointRecordId;

	@NotNull
	private String visitorName;

	@Generated("SparkTools")
	private FaceOrderResponse(Builder builder) {
		this.code = builder.code;
		this.msg = builder.msg;
		this.appointRecordId = builder.appointRecordId;
		this.visitorName = builder.visitorName;
	}

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

	public String getAppointRecordId() {
		return appointRecordId;
	}

	public void setAppointRecordId(String appointRecordId) {
		this.appointRecordId = appointRecordId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	/**
	 * Creates builder to build {@link FaceOrderResponse}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link FaceOrderResponse}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String code;
		private String msg;
		private String appointRecordId;
		private String visitorName;

		private Builder() {
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Builder withMsg(String msg) {
			this.msg = msg;
			return this;
		}

		public Builder withAppointRecordId(String appointRecordId) {
			this.appointRecordId = appointRecordId;
			return this;
		}

		public Builder withVisitorName(String visitorName) {
			this.visitorName = visitorName;
			return this;
		}

		public FaceOrderResponse build() {
			return new FaceOrderResponse(this);
		}
	}

}
