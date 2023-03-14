package com.abhi.entity;

import java.time.LocalDateTime;

public class ErrorDetails {
	public ErrorDetails(String msg, String status, LocalDateTime time) {
		super();
		this.msg = msg;
		this.status = status;
		this.time = time;
	}
	private String msg;
	private String status;
	private LocalDateTime time;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ErrorDetails [msg=" + msg + ", status=" + status + ", time=" + time + "]";
	}
	
	

}
