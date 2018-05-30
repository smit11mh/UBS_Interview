package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinutes {

	@Test
	public void test() {
		Minutes testMinutes = new Minutes();
		assertEquals("OOOOOOOOOOO", testMinutes.getLampsForMinutesMultiplesOfFive(0));
		assertEquals("OOOO", testMinutes.getLampsForSingleMinutes(0));
	}

}
