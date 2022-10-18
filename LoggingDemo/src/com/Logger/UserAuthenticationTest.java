package com.Logger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserAuthenticationTest {
	UserAuthentication ua;
	@BeforeEach
	void beforeEach() {
		ua=new UserAuthentication();
	}
	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}
	@BeforeAll
	static void beforAll() {
		System.out.println("Before All");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}
	@Test
	void loginUserSuccessTest() {
		
		String actual = ua.loginUser("Abhishek", "Abhi01");
		String expected = "Successfully logged in";
		assertEquals(expected, actual);
	}

	@Test
	void loginUserFailureTest() {
		assertThrows(RuntimeException.class, () -> ua.loginUser("", "Abhi01"));
	}
}