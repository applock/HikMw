package com.hik.mw.model;

import java.util.ArrayList;

import javax.validation.constraints.NotNull;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EventsPageInfo {

	@NotNull
	private int PageSize;

	@NotNull
	private int PageNo;

	@NotNull
	private int Total;

	@NotNull
	private ArrayList<PersonInOutEvents> List;

	public int getPageSize() {
		return PageSize;
	}

	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}

	public int getPageNo() {
		return PageNo;
	}

	public void setPageNo(int pageNo) {
		PageNo = pageNo;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public ArrayList<PersonInOutEvents> getList() {
		return List;
	}

	public void setList(ArrayList<PersonInOutEvents> list) {
		List = list;
	}

}
