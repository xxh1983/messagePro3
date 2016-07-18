package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.Message;

public interface MessageService {
	public int add(Message m);
	public List<Message> findAll();
}
