package com.zhoushiyu.domain;

import java.sql.Date;
import java.time.LocalDate;

public class Reader {
	private int id;
	private int bookID;
	private int userID;
	private int state;//0表示未还，1表示已还，2表示丢失，3表示损坏，4其他情况...这里是不是应该写为枚举类型比较好....有空改一下好了
	private Date updateTime;
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
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
