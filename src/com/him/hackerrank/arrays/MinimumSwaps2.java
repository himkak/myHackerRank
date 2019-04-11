package com.him.hackerrank.arrays;

import java.util.Arrays;

public class MinimumSwaps2 {

	static int minimumSwaps(int[] arr) {
		int swaps = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>i+1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==i+1) {
						swap(arr,i,j);
						swaps++;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(swaps);
		return swaps;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 2, 4, 5, 6 };
		System.out.println(minimumSwaps(arr));
		int[] arr1 = {4, 3, 1, 2};
		System.out.println(minimumSwaps(arr1));
		
		int[] arr2 = {2, 3, 4, 1, 5};
		System.out.println(minimumSwaps(arr2));
		
	}

}
