package com.neusoft.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.service.MessageService;

public class MessageAction {
	public String findAll(){
		System.out.println("..MessageAction..findAll().");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
		MessageService ms=(MessageService)ctx.getBean("messageService");
		ms.findAll();
		return "findAll_success";
	}
}
