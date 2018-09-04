package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Message;

@RestController
public class HelloController {
	
	@RequestMapping(value="/")
	public String sayHello()
	{
		return "helloWorld";
	}
	
	@RequestMapping(value="/Message")
	public Message sendMessage() {
		
		Message m=new Message();
		m.setText("divya");
		
		return m;
	}
}
