package Task1;

import java.util.Arrays;

public class Task1_2 {
	private int[] arr;

	public Task1_2(int[] arr) {
		super();
		this.arr = arr;
	}

	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.

	public int iterativeBinarySearch(int target) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] <= target) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}

	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearchHelper(target, 0, arr.length - 1);
	}

	public int recursiveBinarySearchHelper(int target, int low, int high) {
		if (low > high) return -1;
		else {
			int mid = (low + high)/2;
			if (arr[mid] == target) return mid;
			else if (arr[mid] < target) {
				return recursiveBinarySearchHelper(target, mid+1, high);
			}
			else return recursiveBinarySearchHelper(target, low, mid-1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {15,19,25,29,35};
		Task1_2 myArr = new Task1_2(arr);
		int target = 35;
		System.out.println("Target: " + target);
		System.out.print("Array: "); 
		System.out.println(Arrays.toString(arr));
		System.out.println("Vị trí thứ: " + myArr.recursiveBinarySearch(target));
	}
}
