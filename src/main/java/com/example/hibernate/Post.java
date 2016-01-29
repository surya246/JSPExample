package com.example.hibernate;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable{

	private int postId;
	private String title;	
	private String body;

	public int getPostId() {
	return postId;
	}
	public void setPostId(int userId) {
	this.postId = userId;
	}
	public String getTitle() {
	return title;
	}
	public void setTitle(String title) {
	this.title = title;
	}
	public String getBody() {
	return body;
	}
	public void setBody(String body) {
	this.body = body;
	}
	
}
