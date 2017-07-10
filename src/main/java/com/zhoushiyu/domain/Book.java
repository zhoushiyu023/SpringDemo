package com.zhoushiyu.domain;

import java.time.LocalDate;

public class Book {
	private int bookID;
	private String bookName ;
	private String authorName;
	private int hasNumber;
	private LocalDate updateTime;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getHasNumber() {
		return hasNumber;
	}
	public void setHasNumber(int hasNumber) {
		this.hasNumber = hasNumber;
	}
	public LocalDate getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(LocalDate updateTime) {
		this.updateTime = updateTime;
	}
	
}
