package com.veta.awsload.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AwsConfig {
	
	@Value("${aws.s3.accesskey}")
	private String accessKey;
	
	@Value("${aws.s3.secretkey}")
	private String secretKey;
	
	@Value("${aws.s3.region}")
	private String region;
	
	@Bean
	AmazonS3 s3Client() {
		
		AWSCredentials basicCredentials = new BasicAWSCredentials(accessKey, secretKey);
		AmazonS3 amazonS3Client = AmazonS3ClientBuilder.standard().withRegion(region).withCredentials(new AWSStaticCredentialsProvider(basicCredentials)).build();
		return amazonS3Client;
		
	}

}
