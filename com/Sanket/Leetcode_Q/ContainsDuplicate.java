package com.Sanket.Leetcode_Q;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,2,3,2,4};
		System.out.println(containsDup(arr));
	
		
	}

	private static int  containsDup(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i:arr)
		{
			ans=ans^i;
		}
		for (int j = 1; j <arr.length; j++) {
            ans = ans^ j;
        }
        
		return ans;
	}
	
	
	

}
