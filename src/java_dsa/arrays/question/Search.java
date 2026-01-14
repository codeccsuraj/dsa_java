package java_dsa.arrays.question;

public class Search {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 9};
		int t = 6;
		
		int res = BinarySearch(arr, t);
		System.out.println(res);
	}
	
	public static boolean linearSearch (int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public static int linearSearchRecursion (int[] arr, int idx, int target) {
		if (idx == arr.length) {
			return -1;
		}
		
		if (arr[idx] == target) {
			return idx;
		}
		
		return linearSearchRecursion(arr, idx + 1, target);
	}
	
	public static int BinarySearch (int[] arr, int num) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (num == arr[mid]) {
				return mid;
			}
			
			if (num <  arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
}
