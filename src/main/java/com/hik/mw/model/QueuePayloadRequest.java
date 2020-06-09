package com.hik.mw.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class QueuePayloadRequest {
	private String method;
	private Param params;

	@Override
	public String toString() {
		return "QueuePayloadRequest [method=" + method + ", params=" + params + "]";
	}

}

@NoArgsConstructor
@Getter
@Setter
class Param {
	private String sendTime;
	private String ability;
	private List<Event> events;

	@Override
	public String toString() {
		return "Param [sendTime=" + sendTime + ", ability=" + ability + ", events=" + events + "]";
	}

}

@NoArgsConstructor
@Getter
@Setter
class Event {
	private String eventId;
	private int eventType;
	private String happenTime;
	private String srcIndex;
	private String srcName;
	private String srcParentIdex;
	private String srcType;
	private int status;
	private int eventLvl;
	private int timeout;
	private Object data;

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventType=" + eventType + ", happenTime=" + happenTime + ", srcIndex="
				+ srcIndex + ", srcName=" + srcName + ", srcParentIdex=" + srcParentIdex + ", srcType=" + srcType
				+ ", status=" + status + ", eventLvl=" + eventLvl + ", timeout=" + timeout + ", data=" + data + "]";
	}

}
