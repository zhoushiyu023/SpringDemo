package com.zhoushiyu.domain;

import java.sql.Date;
import java.time.LocalDate;

public class Reader {
	private int id;
	private int bookID;
	private int userID;
	private int state;//0��ʾδ����1��ʾ�ѻ���2��ʾ��ʧ��3��ʾ�𻵣�4�������...�����ǲ���Ӧ��дΪö�����ͱȽϺ�....�пո�һ�º���
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
