package com.edubridge.junitDemo1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SampleTest {
	private  static Sample s;
	
	@BeforeAll
	public void setup() {
		s = new Sample();
		
	}
	@AfterAll	
	public static void teraup() {
		s = null;
	}
	

	@Test
	public void testWish() {
		assertEquals("Hello Raaj",s.wish("Raaj"));
				
	}
	public void testValidAuthenticate() {
		boolean actual = s.authenticate("admin@gmail.com", "admin@123");
assertTrue(actual);
	}
public void testInvalidAuthenticate() {
	boolean actual = s.authenticate("abc@gmail.com", "admin@123");
	assertFalse(actual);
}
@ParameterizedTest
@ValueSource(ints = {44,55,66,77,88,99})
public void testIsEven(int num) {
	boolean result = s.isEven(num);
	assertTrue(result);
}
}





