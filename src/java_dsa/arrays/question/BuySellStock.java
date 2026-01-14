package java_dsa.arrays.question;

/**
 * Given an array of integer nums and an integer target, return
indices of the two numbers such that they add up to the target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.

 * **/
public class BuySellStock {
	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3, 3, 4};
		
		int res = bestTimeToBuy(arr);
		
		System.out.println(res);
 	}
	public static int bestTimeToBuy(int[] nums) {
	    int maxProfit = 0;
	    int bestSell = nums[0];

	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            int buy = nums[i];
	            int sell = nums[j];

	            int profit = sell - buy;

	            if (profit > maxProfit) {
	                maxProfit = profit;
	                bestSell = sell;   // return the highest profit sell element
	            }
	        }
	    }

	    return bestSell;
	}
}
