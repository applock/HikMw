package com.hik.mw.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class QapRequest {

	@NotNull
	private String startTime;

	@NotNull
	private String endTime;

	@NotNull
	@Min(value = 1)
	private int pageNo;

	@NotNull
	@Min(value = 1)
	@Max(value = 1000)
	private int pageSize;

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "QapRequest [startTime=" + startTime + ", endTime=" + endTime + ", pageNo=" + pageNo + ", pageSize="
				+ pageSize + "]";
	}

}
