package com.poc.fileUpload.Angular.serviceImpl;

import org.springframework.stereotype.Service;

import com.poc.fileUpload.Angular.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
