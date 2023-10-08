package Task1;

import java.util.Arrays;

public class Task1_1 {
	private int[] arr;

	public Task1_1(int[] arr) {
		super();
		this.arr = arr;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) return i;
		}
		return -1;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearchHelper(target, arr.length);
	}
	
	public int recursiveLinearSearchHelper(int target, int n) {
		if (n == 0) return -1;
		if (target == arr[n-1]) return n-1;
		return recursiveLinearSearchHelper(target, n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,7,2,6};
		Task1_1 myArr = new Task1_1(arr);
		int target = 5;
		System.out.println("Target: " + target);
		System.out.print("Array: "); 
		System.out.println(Arrays.toString(arr));
		System.out.println("Vị trí thứ: " + myArr.recursiveLinearSearch(target));
	}

}
