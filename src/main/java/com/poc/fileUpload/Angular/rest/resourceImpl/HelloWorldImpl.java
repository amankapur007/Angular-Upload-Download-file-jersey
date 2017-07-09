package com.poc.fileUpload.Angular.rest.resourceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.fileUpload.Angular.rest.resource.HelloWorld;
import com.poc.fileUpload.Angular.service.HelloWorldService;

@Component
public class HelloWorldImpl implements HelloWorld{

	@Autowired
	HelloWorldService helloWorldService;
	
	public HelloWorldImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		return helloWorldService.getHelloWorld();
	}

}
