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

}
