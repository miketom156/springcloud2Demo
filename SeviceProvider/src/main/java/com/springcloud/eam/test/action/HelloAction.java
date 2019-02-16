package com.springcloud.eam.test.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HelloAction {

	@Value("${test}")
	private String tem;

	@RequestMapping("hello")
	public String hello() {
		return "test-HelloAction---"+tem;
	}

}
