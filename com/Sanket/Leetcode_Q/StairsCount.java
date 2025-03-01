package com.Sanket.Leetcode_Q;

import java.util.Arrays;

public class StairsCount {

	public static void main(String[] args) {
		//Given are the number of stairs ex: 3, you can take 1 step at a time otr 2 steps at once,find all possible combinations'
		//[1,1,1], [1,2], [2,1]
		//[1,1,1,1] [1,2,1] ,[2,1,1],[2,2], [1,1,2]
		int n=4;
		System.out.println(countpossibleWays(n));
	}

	private static int countpossibleWays(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return 1;
		return countpossibleWays(n-2)+countpossibleWays(n-1);
	}

}
