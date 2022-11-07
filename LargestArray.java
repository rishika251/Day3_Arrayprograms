package com.bridgelabz.day3;

public class LargestArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 85, 110, 87, 99, 1000 };

		int max = arr[0]; // Loop through the array
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array: " + max);

	}

}

