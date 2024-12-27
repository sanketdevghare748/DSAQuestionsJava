package com.Sanket.Leetcode_Q;

import java.util.HashSet;

public class Anchor_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//String array is given we need to max number of common character present in all the strings. for ex: sanket,mniket,venket her common 
		/** here common is n,k,e,t so anchor letter =4; 
		approach: create common string merge to for a set of all unique characters**/
		String [] arr= {"san","saniket","sanket"};
		HashSet<Character> set= new HashSet<>();
		for(char c:arr[0].toCharArray())
		{
			boolean flag=false;
			for(int i=0;i<arr.length;i++)
			{
				
				String str=arr[i];
				if(!str.contains(Character.toString(c)))
				{
					flag=true;
					continue;
				}
			}
			if(!flag)
			{
				set.add(c);
			}		
		}
		System.out.println(set+ " Anchor="+ set.size() );

	}

}
