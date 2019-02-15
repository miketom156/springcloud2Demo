package com.springcloud.eam.test.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceCallBack implements HelloService {

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "error-cirs";
	}

}
