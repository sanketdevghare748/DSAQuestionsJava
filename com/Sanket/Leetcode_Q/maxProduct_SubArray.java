package com.Sanket.Leetcode_Q;

import java.util.Arrays;

public class maxProduct_SubArray {
//https://leetcode.com/problems/maximum-product-subarray/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,-2,4}; //ans=6
		System.out.println(getMaxProduct_SubArray(arr));

	}

private static int getMaxProduct_SubArray(int[] arr) {
	// TODO Auto-generated method stub
	
	int curProduct=1;
	int maxProduct=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(curProduct<=0)
		{
			curProduct=1;
		}
		
		curProduct=curProduct*arr[i];
		maxProduct= Math.max(maxProduct, curProduct);
	}
	
	return maxProduct;
}

}
