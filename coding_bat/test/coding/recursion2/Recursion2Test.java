package coding.recursion2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Recursion2Test {

	@Test
	public void groupSumExamples() {
		int[] nums = {2, 4, 8};
		assertTrue(Recursion2.groupSum(0, nums, 10));
		assertTrue(Recursion2.groupSum(0, nums, 14));
		assertFalse(Recursion2.groupSum(0, nums, 9));
	}
	
	@Test 
	public void groupSumEmptyList() {
		int[] nums = {};
		assertTrue(Recursion2.groupSum(0, nums, 0));
		assertFalse(Recursion2.groupSum(0, nums, 1));
	}
	
	@Test
	public void groupSumSingleElement() {
		int[] nums = {2};
		assertTrue(Recursion2.groupSum(0, nums, 2));
		assertFalse(Recursion2.groupSum(0, nums, 3));
	}
	
	@Test 
	public void groupSumTwoElements() {
		int[] nums = {1, 2};
		assertTrue(Recursion2.groupSum(0, nums, 1));
		assertTrue(Recursion2.groupSum(0, nums, 2));
		assertTrue(Recursion2.groupSum(0, nums, 3));
		assertFalse(Recursion2.groupSum(0, nums, 4));
		assertFalse(Recursion2.groupSum(1, nums, 1));
	}

}
