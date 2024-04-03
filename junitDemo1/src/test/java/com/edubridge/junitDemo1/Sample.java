package com.edubridge.junitDemo1;

public class Sample {

		public String wish(String name) {
			return "Hello"+name;
			
		}
	 public boolean authenticate(String email,String password) {
		 if(email.equals("admin@gmail.com")&& password.equals("admin@123")) {
		  return true;
	 }else {
			  return false;
		  }
	 }

	public boolean isEven(int num) {
	if(num%2 ==0) {
	}else {
		return true;
	}
	return false;
	}
	}


