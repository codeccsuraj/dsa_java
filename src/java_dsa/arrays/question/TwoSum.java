package java_dsa.arrays.question;

public class TwoSum {
/**
 * #### Two Sum ####
 * Q - Given an array of integer nums and a target n. Return indices of the two numbers
 * 	   such that they add up to the target.
 * 		/- not use the same element twice
 * 		
 * 		ex - nums = [2, 7, 11, 15] and target = 9 
 * 		output will [0, 1];
 * **/
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 13};
		int target = 15;
		boolean res = TwoSum(nums, target);
		
		if (res) {
			System.out.println("We found a match that is equal to given target");
		} else {
			System.out.println("There is no match found which is equal to target");
		}
		
	}
	
	public static boolean TwoSum (int[] nums, int target) {
		/**
		 * this process will match target using brute force
		 * for each element in array we will add next element to him i + j 
		 * till we get the results
		 * **/
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return true;
				}
			}
		}
		
		return false;
	}
}
