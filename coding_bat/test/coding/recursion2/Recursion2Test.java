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
	
	@Test
	public void groupSum6Examples() {
		int[] nums = {5, 6, 2};
		assertTrue(Recursion2.groupSum6(0, nums, 8));
		assertFalse(Recursion2.groupSum6(0, nums, 9));
		assertFalse(Recursion2.groupSum6(0, nums, 7));
	}
	
	@Test 
	public void groupSum6EmptyList() {
		int[] nums = {};
		assertTrue(Recursion2.groupSum6(0, nums, 0));
		assertFalse(Recursion2.groupSum6(0, nums, 1));
	}
	
	@Test
	public void groupSum6SingleElement() {
		int[] nums = {6};
		assertTrue(Recursion2.groupSum6(0, nums, 6));
		assertFalse(Recursion2.groupSum6(0, nums, 3));
	}
	
	@Test 
	public void groupSum6TwoElements() {
		int[] nums = {1, 6};
		assertFalse(Recursion2.groupSum6(0, nums, 1));
		assertTrue(Recursion2.groupSum6(0, nums, 6));
		assertTrue(Recursion2.groupSum6(0, nums, 7));
		assertFalse(Recursion2.groupSum6(0, nums, 4));
		assertFalse(Recursion2.groupSum6(1, nums, 1));
	}
	
	@Test
	public void groupNoAdjExamples() {
		int[] nums = {2, 5, 10, 4};
		assertTrue(Recursion2.groupNoAdj(0, nums, 12));
		assertFalse(Recursion2.groupNoAdj(0, nums, 14));
		assertFalse(Recursion2.groupNoAdj(0, nums, 7));
	}
	
	@Test
	public void groupSum5Examples() {
		int[] nums = {2, 5, 10, 4};
		assertTrue(Recursion2.groupSum5(0, nums, 19));
		assertTrue(Recursion2.groupSum5(0, nums, 17));
		assertFalse(Recursion2.groupSum5(0, nums, 12));
		
		int[] nums2 = {2, 10, 1};
		assertFalse(Recursion2.groupSum5(0, nums2, 11));
	}

}
