package com.edubridge.junitDemo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@DisplayName("Calc test")
@TestMethodOrder(OrderAnnotation.class)
public class Calctest {
	private static  Calc c = null;
	/*
	@BeforeEach
	public void setup() {
		System.out.println("BeforeEach");
		c = new Calc();
	}
	*/
	/*
	@AfterEach
	public void tearup() {
		System.out.println("AfterEach");
		c = null;
	}
	*/
	@BeforeAll
	public  static void setup() {
		System.out.println("BeforeAll");
		c =  null;
	}
@AfterAll
  
  public static void tearup() {
	  System.out.println("AfterAll");
	  c = null;
  }
  
	
	
	@Test
	@Order(2)
	@DisplayName("Square test case")
	public void testFinSquare() {
		Calc c = new Calc();
		int actual = c.findSquare(10);
		int expected = 100;
		assertEquals(expected, actual);
		
	}

	@Test
	@Order(1)
	@DisplayName("cube test case")
	public void testFindCube() {
		Calc c = new Calc();
		int actual = c.findCube(10);
		int expected = 1000;
		assertEquals(expected,actual);
}
}