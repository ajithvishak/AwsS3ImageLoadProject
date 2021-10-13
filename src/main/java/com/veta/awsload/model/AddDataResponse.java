package com.veta.awsload.model;

public class AddDataResponse {
	
	private boolean status;
	
	private String errorText;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	

}
