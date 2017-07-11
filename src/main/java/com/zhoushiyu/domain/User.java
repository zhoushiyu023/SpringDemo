package com.zhoushiyu.domain;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {
	private int userID;
	private String userName;
	private String userPassword;
    private int hasNumber;
    private Date updateTime;
    
	public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
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
	public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
	public int getHasNumber() {
		return hasNumber;
	}
	public void setHasNumber(int hasNumber) {
		this.hasNumber = hasNumber;
	}
	
}
