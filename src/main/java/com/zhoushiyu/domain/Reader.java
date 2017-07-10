package com.zhoushiyu.domain;

import java.time.LocalDate;

public class Reader {
	private int id;
	private int bookID;
	private int userID;
	private int state;//0:Î´»¹¡£1£ºÒÑ»¹
	private LocalDate updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public LocalDate getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(LocalDate updateTime) {
		this.updateTime = updateTime;
	}
}
