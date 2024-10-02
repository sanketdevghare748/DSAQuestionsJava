package com.Sanket.Leetcode_Q;

import java.util.Arrays;

public class Merge_two_SortedArrays {
//give two sorted array merget them to get one sorted array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,3,5};
		int [] arr2= {2,4,6};
		
		System.out.println(Arrays.toString(mergeArray(arr1,arr2)));

	}

private static int[] mergeArray(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	int [] arr3= new int[arr1.length+arr2.length];
	//Case1: arr1[i]<arr2[i]
	arr3= Arrays.copyOf(arr1, arr1.length-1);
	

	
	return arr3;
}

}
