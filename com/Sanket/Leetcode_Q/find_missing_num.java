package com.Sanket.Leetcode_Q;

import java.util.ArrayList;
import java.util.List;

public class find_missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,4,6,8,9,11,13}; //so here missing numbers are 2,5,7 so get them
		
		System.out.println(getMissingNumbers(arr));

	}

	private static List<Integer> getMissingNumbers(int[] arr) {
		List <Integer> list= new ArrayList<>();
		List <Integer> op= new ArrayList<>();
		int [] arr2 = new int[arr[(arr.length-1)]];
		for(int i: arr)
		{
			list.add(i);
		}
		for(int i=0;i<arr[arr.length-1];i++)
		{
			arr2[i]=i+1;
			
		}
		
		for(int n:arr2)
		{
			if(!list.contains(n))
			{
				op.add(n);
			}
		}
		return op;
	}
	

}
