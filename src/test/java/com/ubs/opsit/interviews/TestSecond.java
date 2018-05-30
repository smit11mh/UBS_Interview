package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSecond {

	@Test
	public void test() {
		Second testSecond = new Second();
		assertEquals("Y", testSecond.convertTime(0));
	}

}
