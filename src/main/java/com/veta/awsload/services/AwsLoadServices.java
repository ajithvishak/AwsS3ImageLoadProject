package com.veta.awsload.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.veta.awsload.model.AddDataRequest;

@Service
public class AwsLoadServices {

	@Value("${aws.s3.bucketname}")
	private String bucketName;
	
	@Autowired
	AmazonS3 s3Client;
	
	
	public boolean saveFile(AddDataRequest addDataReq) {
		PutObjectResult resultObj = s3Client.putObject(
				bucketName, addDataReq.getKey(), addDataReq.getDataInpusStream(), null);
		
		if(resultObj != null && resultObj.getETag() != null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
