package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotation {

	@Test
	@DisplayName("simplejnitTestMethod")
	void test() {
		System.out.println("first junit test case");
	}
	//if the test has given a comment that it will sjow only one runs \+
	@Test
	@BeforeAll
	//if we make this method as static then we will not get method name in testing , to overcome this we must havw to use "@TestInstance(Lifecycle.PER_CLASS)"
	static void display() {
		System.out.println("welcome");
	}
	
	@Test
	@AfterEach
	@Disabled
	void accept()
	{
		System.out.println("after each method");
	}
	@Test
	@AfterAll
	static void run()
	{
		System.out.println("after all method");
	}
	
	@Test
	@BeforeEach
	 void fun()
	{
		System.out.println("before eachmethod");
	}
	
	
	
	
}
