package com.BuchalkaTim;

import java.util.Arrays;

public class SortArray {

	public int[] sortingOfArray(int[] arrayToSort) {

		//int[] arr = { 106, 26, 81, 5, 15 };
		//int[] sortedArray = Arrays.copyOf(arr, arr.length);
		// int[] sortedArray = Arrays.copyOf(arr, 2);//copy only first 2 elements of an array to a new array

		int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
		System.out.println("Array to sort : " + Arrays.toString(sortedArray));
		
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;

			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("sorted array : " + Arrays.toString(sortedArray));
		return sortedArray;
	}

}
