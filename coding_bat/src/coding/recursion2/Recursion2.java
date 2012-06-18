package coding.recursion2;

public class Recursion2 {
	public static boolean groupSum(int start, int[] nums, int target) {
		boolean result = false;
		if (target == 0) {
			result = true;
		} else if (start > nums.length - 1) {
			result = false;
		} else if (nums[start] == target) {
			result = true;
		} else if (groupSum(start + 1, nums, target)) {
			result = true;
		} else {
			result = groupSum(start + 1, nums, target - nums[start]);
		}
		return result;
	}
	
//	private static int count6(int start, int[] nums) {
//		int count = 0;
//		for (int x = start; x < nums.length; x++) {
//			if (nums[x] == 6) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static boolean groupSum6(int start, int[] nums, int target) {
//		boolean result = false;
//		
//		// base case
//		if (start == nums.length) {
//			result = target == 0;
//		} else if (start == nums.length - 1) {
//			result = (nums[start] == target) || (target == 0);
//		} else {
//			// recursion case
//			int extraSix = count6(start + 1, nums) * 6;
//			result = groupSum6(start + 1, nums, target - nums[start] - extraSix) ||
//					groupSum6(start + 1, nums, target - extraSix);
//		}
//		
//		return result;
//	}

	
	public static boolean groupSum6(int start, int[] nums, int target) {
		
		// base case
		if (start == nums.length) {
			return target == 0;
		}
		
		// recursive case
		if (nums[start] == 6) {
			// We must use the 6
			return groupSum6(start + 1, nums, target - 6);
		} else {
			return (groupSum6(start + 1, nums, target - nums[start])) 
					|| 
					groupSum6(start + 1, nums, target);
			
		}
		
	}
	
}
