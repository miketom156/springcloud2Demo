package com.springcloud.eam.test.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.eam.test.service.HelloService;

@RestController
@RequestMapping("test")
public class HelloAction {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("hello")
	public String hello(){
		return helloService.hello();
	}
	
}
