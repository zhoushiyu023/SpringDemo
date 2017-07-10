package com.zhoushiyu.domain;

import java.io.Serializable;

public class User implements Serializable {
	private int userID;
	private String userName;
	private int hasNumber;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getHasNumber() {
		return hasNumber;
	}
	public void setHasNumber(int hasNumber) {
		this.hasNumber = hasNumber;
	}
	
}
