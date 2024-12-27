package com.Sanket.Leetcode_Q;

import java.util.Arrays;
import java.util.LinkedList;

public class PlusOnce {
//https://leetcode.com/problems/plus-one/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inpur= [1,2,3] op= [1,2,4]
		//input[9,9,9] op=[1,0,0,0]
		int []digits= {9,9,0,9};
		System.out.println(Arrays.toString(getop(digits)));
		
	}
	
	public static int [] getop(int[] digits)
	{
		for(int i=digits.length-1;i>=0;i--)
		{
		
			if(digits[i]<9)
			{
				digits[i]++;
				return digits;
			}
			digits[i]=0;			
	}

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

	}
}
