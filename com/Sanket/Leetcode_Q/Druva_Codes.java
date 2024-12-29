package com.Sanket.Leetcode_Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Druva_Codes {
//Q:1 given an array
	/** Input: new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"}
		Output: B:3,Y:1 write code in java **/
	public static void program1(String [] arr)
	{
		//convert the given array of String into hashmap of Character and Integer.
		HashMap<String,Integer> map= new HashMap<String, Integer>();
		for(String str:arr)
		{
			String key=str.split(":")[0];
			int  value=Integer.valueOf(str.split(":")[1]);
			int actualValue=map.getOrDefault(key, 0)+value;
			map.put(key, map.getOrDefault(key, 0)+value);
		}
		List<String> toRemove = new ArrayList<>();
		for(Entry et:map.entrySet())
		{
			if(et.getValue().equals(0))
			{
				 toRemove.add((String) et.getKey());
				
			}	
		}
		for(String s:toRemove)
		{
			map.remove(s);
		}
		System.out.println(map);
	}
	
	
	//Second Q: 
	/** input find the sum of larget 4 elements of array and if there are less than 4 elments add them all.
	 * append it to the given secret key in such a way that every third character should be the sum we got.
	**/
	
	public static String program2(int [] arr,String secret)
	{
		Arrays.sort(arr);
		int count=0;
		int sum=0;
		if(arr.length<4)
		{
			count=arr.length;
		}
		else
		{
			count=4;
		}
		for(int i=0;i<count;i++)
		{
			sum=sum+arr[i];
		}
		//append the given sum after every third charater of the secret key.
		String op="";
		for(int j=0;j<secret.length();j++)
		{
			op=op+secret.charAt(j);
			if((j+1)%3==0)
			{
				op=op+Integer.toString(sum);
			}
		}
		return op;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr={"X:-1", "Y:1", "X:-4", "B:3", "X:5","Y:-1"};
		program1(arr);
		//program 2:
		int [] arr2= {1,4,2,5,6,3,-1};
		System.out.println(program2(arr2,"wejo1fterqas"));
	}

}
