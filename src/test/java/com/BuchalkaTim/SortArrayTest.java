package com.BuchalkaTim;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArrayTest {
	@Test
	public void f() {
		int[] arr = { 106, 26, 81, 5, 15, 30, 35, 23, 70 };
		System.out.println("array : " + Arrays.toString(arr));
		System.out.println("printing array : " + Arrays.toString(arr));

		for (int j = 0; j <= arr.length - 1; j++) {
			boolean allSorted = true;
			for (int i = 0; i < arr.length; i++) {
				// System.out.println("element : " + arr[i]);
				// while (i <= arr.length - 1)
				if (i < arr.length - 1)
					if (arr[i] > arr[i + 1]) {
						allSorted = false;
						// System.out.println(arr[i] + " is bigger than " + arr[i + 1]);
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
			}
			System.out.println("array " + j + " : " + Arrays.toString(arr));
			System.out.println("allSorted : " + allSorted);
			if (allSorted)
				break;
		}
		int[] sortedArray = arr;
		System.out.println("sorted array : " + Arrays.toString(arr));
		System.out.println("sorted array : " + Arrays.toString(sortedArray));
	}
	
	@Test
	public void fnSortTest() {
		SortArray sortObj = new SortArray();
		int[] arr = { 106, 26, 81, 5, 15, 30, 35, 23, 70 };
		//int[] sortedArray = sortObj.sortingOfArray(arr);
		System.out.println(Arrays.toString(sortObj.sortingOfArray(arr)));
	}
	
	@Test
	public void fnArrayTest() {
		
		//arrays are pass by reference types
		//when you copy a array into another array, both array point to same object/memory reference
		//there is only one copy of the array and both references are pointing to the same object in memory
		//if you update one array, copied array would also reflect that change
		//if you pass this array to some fn which accepts int array as parameter, another reference would be created pointing to the same array values
		int[] arr = {10, 20, 40, 60, 80, 120};
		System.out.println("arr : " + Arrays.toString(arr)); //arr : [10, 20, 40, 60, 80, 120]
		int[] arr2 = arr;
		System.out.println("arr2 : " + Arrays.toString(arr2));//arr2 : [10, 20, 40, 60, 80, 120]
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 2;
		}
		System.out.println("arr : " + Arrays.toString(arr));//arr : [12, 22, 42, 62, 82, 122]
		System.out.println("arr2 : " + Arrays.toString(arr2));//arr2 : [12, 22, 42, 62, 82, 122]
		
		//if we use a new keyword now, it would dereference arr2 older reference to arr and make it point to the new memory which stores different data
		arr2 = new int[] {80,90};
		System.out.println("arr : " + Arrays.toString(arr));//arr : [12, 22, 42, 62, 82, 122]
		System.out.println("arr2 : " + Arrays.toString(arr2));//arr2 : [80, 90]
		
		
		int[] arrTrySort = {106, 26, 81, 5, 15, 30, 35, 23, 70 };
		System.out.println("arrTrySort : " + Arrays.toString(arrTrySort));
		Arrays.sort(arrTrySort);
		System.out.println("arrTrySort : " + Arrays.toString(arrTrySort));
		System.out.println("smallest element in arrTrySort : " + arrTrySort[0]);
		int[] arrTrySort2 = {106, 26, 82, 5, 15, 30, 35, 70 };
		System.out.println("arr mismatch : " + Arrays.mismatch(arrTrySort, arrTrySort2));
		
		String[] arrStrVal = {"Ram","Bam","RBC","RBA","Khalid","kshama"};
		System.out.println("arrStrVal : " + Arrays.toString(arrStrVal));
		Arrays.sort(arrStrVal);
		System.out.println("sorted arrStrVal : " + Arrays.toString(arrStrVal));
		
		char[] arrCharVal = {'R','B','R','b','w','W'};
		System.out.println("arrStrVal : " + Arrays.toString(arrCharVal));
		Arrays.sort(arrCharVal);
		System.out.println("sorted arrStrVal : " + Arrays.toString(arrCharVal));
		
	}
	
	@Test
	public void ReverseArray() {
		int[] arr = {106, 26, 81, 5, 15, 30, 35, 23, 70 };
		System.out.println("arr : " + Arrays.toString(arr));
		int[] arrReversed = new int[arr.length];
		System.out.println("arrReversed : " + Arrays.toString(arrReversed));
		int j=0;
		for(int i= (arr.length-1) ; i>=0 ; i--) {
			arrReversed[j] = arr[i];
			j++;
		}
		System.out.println("reversed arr : " + Arrays.toString(arrReversed));
	}
	
	@Test
	public void ReverseArrayWithoutAnotherArray() {
		int[] arr = {106, 26, 81, 5, 15, 30, 35, 23, 70 };
		System.out.println("arr : " + Arrays.toString(arr));
		int j=0;
		int temp = 0;
		for(int i= (arr.length-1) ; i>=(arr.length-1)/2 ; i--) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			j++;
		}
		System.out.println("reversed arr : " + Arrays.toString(arr));
		
		for(int i= 0 ; i<=(arr.length-1)/2 ; i++) {
			temp = arr[(arr.length-1) - i];
			arr[(arr.length-1) - i] = arr[i];
			arr[i] = temp;
		}
		System.out.println("reversed arr : " + Arrays.toString(arr));
	}
	
	@Test
	public void IncreaseArraySize() {
		int[] arr = {106, 26, 81, 5, 15, 30, 35, 23, 70 };
		System.out.println("arr length : " + arr.length);//arr length : 9		
		System.out.println("arr : " + Arrays.toString(arr));
		//arr : [106, 26, 81, 5, 15, 30, 35, 23, 70]

		arr = Arrays.copyOf(arr, 20);
		System.out.println("arr length : " + arr.length);//arr length : 20
		System.out.println("arr : " + Arrays.toString(arr));
		//arr : [106, 26, 81, 5, 15, 30, 35, 23, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		

	}

}
