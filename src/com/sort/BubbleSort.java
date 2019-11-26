package com.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		bubbleSort(arr1);
		bubbleSortOptimized(arr1);
		
	}

	static void bubbleSort(int[] arr) {
		long l1 = System.currentTimeMillis();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("Iteration " + (i + 1) + ": ");
			printArray(arr);
		}
		long l2 = System.currentTimeMillis();
		System.out.println("time " + (l2 - l1)+ " ms");
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void bubbleSortOptimized(int[] arr) {
		long l1 = System.currentTimeMillis();

		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}	
			}
			System.out.print("Iteration OP " + (i + 1) + ": ");
			printArray(arr);
			if(swapped == false) {
				break;
			}
		
		}
		long l2 = System.currentTimeMillis();
		System.out.println("time " + (l2 - l1)+ " ms");
	}

}
