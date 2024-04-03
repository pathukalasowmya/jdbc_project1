package com.edubridge.MockitoDemo.service;

import com.edubridge.MockitoDemo.dao.LoginDao;

public class LoginServiceImpl implements LoginService {
 private LoginDao dao;
 


	public LoginServiceImpl(LoginDao dao) {
	this.dao = dao;
}



	@Override
	public boolean Login(String uname, String upassword) {
		boolean status = dao.authenticate(uname, upassword);
		if(status) {
			return true;
		}
		return false;
	}
	

}
