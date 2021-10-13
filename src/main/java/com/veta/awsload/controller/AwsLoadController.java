package com.veta.awsload.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.veta.awsload.model.AddDataRequest;
import com.veta.awsload.model.AddDataResponse;
import com.veta.awsload.model.AddRequest;
import com.veta.awsload.services.AwsLoadServices;

@RestController
public class AwsLoadController {
	
	@Autowired
	AwsLoadServices awsLoadServices;
	
	@PostMapping(path = "api/v1/s3Load")
	public AddDataResponse AddFileToAws(@RequestParam("file") MultipartFile file, @RequestParam("key") String key) {
		
		AddDataRequest addRequest = new AddDataRequest();
		addRequest.setKey(key);
		
		try {
			addRequest.setDataInpusStream(file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean status = awsLoadServices.saveFile(addRequest);
		
		AddDataResponse response = new AddDataResponse();
		response.setStatus(status);
		response.setErrorText(status ? "Success": "Failed");
		
		return response;
		
	}

}
