package com.bridgelabz.day3;

public class SmallestArray {
	public static void main(String[] args) {

		int[] arr = new int[] { 9, 88, 54, 23, 3 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in given array: " + min);

	}

}

