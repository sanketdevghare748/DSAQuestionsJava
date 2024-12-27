package com.Sanket.Leetcode_Q;

import java.util.ArrayList;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr={"X:-1", "Y:1", "X:-4", "B:3", "X:5","Y:-1"};
		program1(arr);

	}

}
