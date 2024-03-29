package com.quinnox.jaxrsdownload.excepmodel;

import java.util.Date;

public class ErrorMessage {
	
	  private Date timestamp;
	  private String errorMessage;
	  private String statusCode;
	  private String details; 
	  
	  public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(Date timestamp, String errorMessage, String statusCode, String details) {
		super();
		this.timestamp = timestamp;
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	  
	  
}
