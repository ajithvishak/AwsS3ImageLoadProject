package com.veta.awsload.model;

import org.springframework.web.multipart.MultipartFile;

public class AddRequest {
	
	private String key;
	
	private MultipartFile file;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	

}
