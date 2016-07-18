package com.neusoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neusoft.bean.Message;
import com.neusoft.dao.MessageDao;
import com.neusoft.service.MessageService;

@Service(value = "messageService")
public class MessageServiceBean implements MessageService {
	@Resource(name = "messageDao")
	private MessageDao messageDao;

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public int add(Message m) {
		System.out.println("..MessageServiceBean..add().");
		return 0;
	}

	public List<Message> findAll() {
		System.out.println("..MessageServiceBean..findAll().");
		messageDao.findAll();
		return null;
	}

}
