package com.hik.mw.model;

import javax.validation.constraints.NotNull;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PersonInOutEvents {

	@NotNull
	private String eventId;

	@NotNull
	private int eventType;

	@NotNull
	private String eventName;

	@NotNull
	private String eventTime;

	private String personId;

	private String cardNo;

	private String personName;
	private String orgIndexCode;
	private String doorName;
	private String doorIndexCode;
	private String doorRegionIndexCode;

	@NotNull
	private int inAndOutType;
	private String picUri;
	private String svrIndexCode;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getOrgIndexCode() {
		return orgIndexCode;
	}

	public void setOrgIndexCode(String orgIndexCode) {
		this.orgIndexCode = orgIndexCode;
	}

	public String getDoorName() {
		return doorName;
	}

	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}

	public String getDoorIndexCode() {
		return doorIndexCode;
	}

	public void setDoorIndexCode(String doorIndexCode) {
		this.doorIndexCode = doorIndexCode;
	}

	public String getDoorRegionIndexCode() {
		return doorRegionIndexCode;
	}

	public void setDoorRegionIndexCode(String doorRegionIndexCode) {
		this.doorRegionIndexCode = doorRegionIndexCode;
	}

	public int getInAndOutType() {
		return inAndOutType;
	}

	public void setInAndOutType(int inAndOutType) {
		this.inAndOutType = inAndOutType;
	}

	public String getPicUri() {
		return picUri;
	}

	public void setPicUri(String picUri) {
		this.picUri = picUri;
	}

	public String getSvrIndexCode() {
		return svrIndexCode;
	}

	public void setSvrIndexCode(String svrIndexCode) {
		this.svrIndexCode = svrIndexCode;
	}

}
