package com.veta.awsload.model;

import java.io.InputStream;

public class AddDataRequest {
	
	private String key;
	
	private InputStream dataInpusStream;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public InputStream getDataInpusStream() {
		return dataInpusStream;
	}

	public void setDataInpusStream(InputStream dataInpusStream) {
		this.dataInpusStream = dataInpusStream;
	}
	
	

}
