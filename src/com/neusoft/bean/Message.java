package com.neusoft.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Date time;
	private String title;
	private String msg;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(String name, Date time, String title, String msg) {
		this.name = name;
		this.time = time;
		this.title = title;
		this.msg = msg;
	}

	// Property accessors



	public String getName() {
		return this.name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}