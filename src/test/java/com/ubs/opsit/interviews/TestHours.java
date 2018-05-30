package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHours {

	@Test
	public void test() {
		Hours testHours = new Hours();
		assertEquals("RRRO", testHours.getLampsForHoursMultiplesOfFive(15));
		assertEquals("RROO", testHours.getLampsForSingleHours(2));
	}

}
