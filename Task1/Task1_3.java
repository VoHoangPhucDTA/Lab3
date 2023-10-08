package Task1;

import java.util.Arrays;

public class Task1_3 {
	private int[] arr;

	public Task1_3(int[] arr) {
		super();
		this.arr = arr;
	}

	public int iterativeBinarySearch(int target) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] <= target) {
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return -1;
	}

	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearchHelper(target, 0, arr.length - 1);
	}

	public int recursiveBinarySearchHelper(int target, int low, int high) {
		if (low > high)
			return -1;
		else {
			int mid = (low + high) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target) {
				return recursiveBinarySearchHelper(target, low, mid - 1);
			} else
				return recursiveBinarySearchHelper(target, mid + 1, high);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {25,21,17,15,10};
		Task1_3 myArr = new Task1_3(arr);
		int target = 15;
		System.out.println("Target: " + target);
		System.out.print("Array: "); 
		System.out.println(Arrays.toString(arr));
		System.out.println("Vị trí thứ: " + myArr.iterativeBinarySearch(target));
	}
}
