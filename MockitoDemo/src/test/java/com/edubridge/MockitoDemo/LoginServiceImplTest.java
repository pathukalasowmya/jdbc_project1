package com.edubridge.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.edubridge.MockitoDemo.dao.LoginDao;
import com.edubridge.MockitoDemo.service.LoginService;
import com.edubridge.MockitoDemo.service.LoginServiceImpl;


public class LoginServiceImplTest {
	private static final String Mockito = null;
	private static LoginService service;
	private static com.edubridge.MockitoDemo.dao.LoginDao loginDao;
	
	@BeforeAll
	public static void setup() {
		
		//Creating Mock Object...
		loginDao = Mockito.mock(LoginDao.class);
		service = new LoginServiceImpl(loginDao);
		
	}
	
	@AfterAll
	public static void tearup() {
		loginDao = null;
		service = null;
	}
	
	@Test
	public void testLoginWithValidCredentials() {
		Mockito.when(loginDao.authenticate("admin", "admin123")).thenReturn(true);
		boolean result = service.Login("admin", "admin123");
		assertTrue(result);
		
	}
	
	@Test
	public void testLoginWithInvalidCredentials() {
		Mockito.when(loginDao.authenticate("abc", "abc123")).thenReturn(false);
		
		boolean result = service.Login("abc", "abc123");
		assertFalse(result);
		
	}

	
}

