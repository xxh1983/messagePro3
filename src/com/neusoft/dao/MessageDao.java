package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.Message;

public interface MessageDao {
	public int add(Message m);
	public List<Message> findAll();
}
