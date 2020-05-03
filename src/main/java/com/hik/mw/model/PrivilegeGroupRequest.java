package com.hik.mw.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PrivilegeGroupRequest {
	
	@Size(min = 0, max = 64)
	private String name;

	@NotNull
	@Min(value = 1)
	private int pageNo;

	@NotNull
	@Min(value = 1)
	@Max(value = 1000)
	private int pageSize;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "PrivilegeGroupRequest [name=" + name + ", pageNo=" + pageNo + ", pageSize=" + pageSize + "]";
	}

}
