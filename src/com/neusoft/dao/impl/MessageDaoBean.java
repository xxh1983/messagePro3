package com.neusoft.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neusoft.bean.Message;
import com.neusoft.dao.MessageDao;
@Repository(value="messageDao")
public class MessageDaoBean implements MessageDao {

	public int add(Message m) {
		System.out.println("..MessageDaoBean..add..");
		return 0;
	}

	public List<Message> findAll() {
		System.out.println("..MessageDaoBean..findAll..");
		return null;
	}

}
