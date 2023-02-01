package com.bridgelabz.generics;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumFinderTest {
	
	@Test
	void given3Num_WhenMaxValueAt1stPosition_ShouldReturnFirstValue() {
		MaxFinder maxFinder = new MaxFinder();
		Integer output = maxFinder.finderMax(10, 8, 5);
        assertEquals(maxFinder, output);;
	}

}
