package com.Sanket.Leetcode_Q;

import java.util.Arrays;

/**
 * Problem: Rotate an array of n elements to the right by k steps. For example,
 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 **/

public class RotateArray {
	// 1. Divide the array two parts: 1,2,3,4 and 5, 6
//	2. Reverse first part: 4,3,2,1,5,6
//	3. Reverse second part: 4,3,2,1,6,5
//	4. Reverse the whole array: 5,6,1,2,3,4
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int order = 3;
		System.out.println(Arrays.toString(rotateArrayBy(arr, order)));

	}

	private static int[] rotateArrayBy(int[] arr, int order) {
		// TODO Auto-generated method stub
		if (order > arr.length) {
			order = order % (arr.length);

		}
		
		//length of first part
		int a = arr.length - order;
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		return arr;
		}
	
		public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1)
		return;
		
		while(left < right)
		{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
		}
		}

	}


