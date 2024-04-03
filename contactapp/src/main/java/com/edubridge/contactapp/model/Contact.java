package com.edubridge.contactapp.model;
/*
 *POjo - plain old java object
 *DTO - data transfer object
 *VO- Value Object
 *MODEL/Entity class 
 * 
 */
public class Contact {
	private int id;
	 private String name ,email;
	 private long mobile;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	
	
		
	}
}
	


