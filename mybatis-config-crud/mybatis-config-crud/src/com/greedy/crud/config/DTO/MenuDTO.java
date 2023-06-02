package com.greedy.crud.config.DTO;

import java.sql.Date;

public class MenuDTO {
	private String postingNo;
	private String blogNum;
	private String categoryNo;
	private String postingTitle;
	private String postringContent;
	private Date postingTime;
	private String state;
	
	public MenuDTO() {
		
	}
	public MenuDTO(String postingNo, String blogNum, String categoryNo, String postingTitle, String postringContent,
			Date postingTime, String state) {
		super();
		this.postingNo = postingNo;
		this.blogNum = blogNum;
		this.categoryNo = categoryNo;
		this.postingTitle = postingTitle;
		this.postringContent = postringContent;
		this.postingTime = postingTime;
		this.state = state;
	}
	public String getPostingNo() {
		return postingNo;
	}
	public void setPostingNo(String postingNo) {
		this.postingNo = postingNo;
	}
	public String getBlogNum() {
		return blogNum;
	}
	public void setBlogNum(String blogNum) {
		this.blogNum = blogNum;
	}
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getPostingTitle() {
		return postingTitle;
	}
	public void setPostingTitle(String postingTitle) {
		this.postingTitle = postingTitle;
	}
	public String getPostringContent() {
		return postringContent;
	}
	public void setPostringContent(String postringContent) {
		this.postringContent = postringContent;
	}
	public Date getPostingTime() {
		return postingTime;
	}
	public void setPostingTime(Date postingTime) {
		this.postingTime = postingTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "MenuDTO [postingNo=" + postingNo + ", blogNum=" + blogNum + ", categoryNo=" + categoryNo
				+ ", postingTitle=" + postingTitle + ", postringContent=" + postringContent + ", postingTime="
				+ postingTime + ", state=" + state + "]";
	}
	
	

}
