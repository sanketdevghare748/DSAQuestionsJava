package com.Sanket.Leetcode_Q;

import java.util.ArrayList;
import java.util.List;

public class RotateString {
	//https://leetcode.com/problems/rotate-string/
	//Input: s = "abcde", goal = "cdeab"
	//Output: true
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="eat";
		String goal="abcde";
		
		System.out.println(isGoalAcheivable(s,goal));
		
		String strArr[]= {"eat","ram","sham","Sanket"};
		
		System.out.println(findAllAnagrams(strArr));
				
				

	}

	private static  List<List<String>> findAllAnagrams(String[] strArr) {
		// TODO Auto-generated method stub
		List <List<String>> OutputList= new ArrayList<>();
		
		for(int i=0;i<strArr.length;i++)
		{
			OutputList.add(getAllAnagramsfromString(strArr[i]));
		}
		return OutputList;
	}
	public static List <String> getAllAnagramsfromString(String str)
	{
		List <String> wordList= new ArrayList<>();
		
			int count=0;
			while(count<str.length())
					{
						wordList.add(str);
						str=rotatedString(str);
						count ++;
					}
		
			return wordList;
			
		}
	

	private static boolean isGoalAcheivable(String s, String goal) {
		// TODO Auto-generated method stub
		int count=1;
		String temp=s;
		while(count!=s.length())
		{
					temp=rotatedString(temp);
			//System.out.println(temp);
			if(temp.equals(goal))
			{
				return true;
			}
			count++;
		}
		return false;
	}

	private static String rotatedString(String s) {
		// TODO Auto-generated method stub
		
		{
			 char c=s.charAt(0);
			 s= s.substring(1)+c;
			 return s;
		}
		
	}

}
