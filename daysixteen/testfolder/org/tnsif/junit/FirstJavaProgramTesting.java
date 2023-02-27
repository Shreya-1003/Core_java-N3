package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgramTesting {

	@Test
	@DisplayName("simplejnitTestMethod")
	void test() {
		System.out.println("first junit test case");
	}
	//if the test has given a comment that it will sjow only one runs \+
	//@Test
	void display() {
		System.out.println("welcome");
	}

}
