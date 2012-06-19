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
			return groupSum6(start + 1, nums, target - nums[start])
					|| 
					groupSum6(start + 1, nums, target);
			
		}
		
	}

	public static boolean groupNoAdj(int start, int[] nums, int target) {
		// base case
		if (start >= nums.length) {
			return target == 0;
		}
		// recursive case
		else {
			return groupNoAdj(start + 2, nums, target - nums[start]) ||
					groupNoAdj(start + 1, nums, target);
		}
	}

	public static boolean groupSum5(int start, int[] nums, int target) {
		// base case
		if (start >= nums.length){
			return target == 0;
		}
		// recursive case
		if (nums[start] % 5 == 0) {
			// it must be chosen
			if ((start < nums.length - 1) && (nums[start + 1] == 1)) {
				// but skip the next one if its "1"
				return groupSum5(start + 2, nums, target - nums[start]);
			}
			return groupSum5(start + 1, nums, target - nums[start]);
		} else {
			return groupSum5(start + 1, nums, target - nums[start]) ||
					groupSum5(start + 1, nums, target);
		}
	}
	
}
