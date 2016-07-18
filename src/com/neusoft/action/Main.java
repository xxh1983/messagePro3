package com.neusoft.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.bean.Message;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cx=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Ok");
		Message msg=(Message) cx.getBean("msg");
		System.out.println(msg.getId());
	}

}
