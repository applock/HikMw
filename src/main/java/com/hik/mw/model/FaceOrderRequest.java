package com.hik.mw.model;

import java.util.ArrayList;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FaceOrderRequest {

	private PersonType personType;

	@NotNull
	private String visitorName;

	@Size(min = 0, max = 128)
	private String contractName;

	private int certificateType;

	private String certificateNo;

	// @Pattern(regexp = "[([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))]")
	private String birthday;

	@Size(min = 0, max = 128)
	private String designation;

	@Size(min = 0, max = 128)
	private String partialId;

	@Size(min = 0, max = 128)
	private String plateNo;

	@Size(min = 0, max = 128)
	private String hostName;

	@Size(min = 0, max = 128)
	private String nationality;

	@Size(min = 0, max = 128)
	private String packageName;

	@NotNull
	@Min(value = 1)
	@Max(value = 2)
	private int gender;

	@Size(min = 0, max = 128)
	private String deliveryType;

	@Email
	private String email;

	// @Pattern(regexp = "[([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))]")
	private String workPermit;

	@NotNull
	@Pattern(regexp = "\\A[0-9]{10}\\z")
	private String phoneNo;

	@Size(min = 0, max = 128)
	private String visitPurpose;

	@NotNull
	// @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
	@Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})$")
	private String visitStartTime;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
	private String visitEndTime;

	@NotNull
	private String visitPhoto;

	@NotNull
	private ArrayList<String> priviledgeGroupIds;

	@Override
	public String toString() {
		return "FaceOrderRequest [personType=" + personType + ", visitorName=" + visitorName + ", contractName="
				+ contractName + ", certificateType=" + certificateType + ", certificateNo=" + certificateNo
				+ ", birthday=" + birthday + ", designation=" + designation + ", partialId=" + partialId + ", plateNo="
				+ plateNo + ", hostName=" + hostName + ", nationality=" + nationality + ", packageName=" + packageName
				+ ", gender=" + gender + ", deliveryType=" + deliveryType + ", email=" + email + ", workPermit="
				+ workPermit + ", phoneNo=" + phoneNo + ", visitPurpose=" + visitPurpose + ", visitStartTime="
				+ visitStartTime + ", visitEndTime=" + visitEndTime + ", visitPhoto=" + visitPhoto
				+ ", priviledgeGroupIds=" + priviledgeGroupIds + "]";
	}

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public int getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(int certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPartialId() {
		return partialId;
	}

	public void setPartialId(String partialId) {
		this.partialId = partialId;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkPermit() {
		return workPermit;
	}

	public void setWorkPermit(String workPermit) {
		this.workPermit = workPermit;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getVisitPurpose() {
		return visitPurpose;
	}

	public void setVisitPurpose(String visitPurpose) {
		this.visitPurpose = visitPurpose;
	}

	public String getVisitStartTime() {
		return visitStartTime;
	}

	public void setVisitStartTime(String visitStartTime) {
		this.visitStartTime = visitStartTime;
	}

	public String getVisitEndTime() {
		return visitEndTime;
	}

	public void setVisitEndTime(String visitEndTime) {
		this.visitEndTime = visitEndTime;
	}

	public String getVisitPhoto() {
		return visitPhoto;
	}

	public void setVisitPhoto(String visitPhoto) {
		this.visitPhoto = visitPhoto;
	}

	public ArrayList<String> getPriviledgeGroupIds() {
		return priviledgeGroupIds;
	}

	public void setPriviledgeGroupIds(ArrayList<String> priviledgeGroupIds) {
		this.priviledgeGroupIds = priviledgeGroupIds;
	}

}
