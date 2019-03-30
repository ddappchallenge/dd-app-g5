package com.ddth.challenge.shtp.model;

public class ResponseMessage {
	private String message;
	private String status;

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}
}
