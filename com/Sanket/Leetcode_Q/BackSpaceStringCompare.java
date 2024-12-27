package com.Sanket.Leetcode_Q;

import java.util.Stack;

public class BackSpaceStringCompare {
//https://leetcode.com/problems/backspace-string-compare/description/
	/**Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac". **/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ab#c"; 
		String t = "ad#c";
		
		
		String newS=getcorrect(s);
		String newT=getcorrect(t);
		
		System.out.println(newS);
		System.out.println(newT);
		
		
	}

private static String getcorrect(String t) {
	// TODO Auto-generated method stub
	Stack<Character> st1= new Stack<Character>();
	for(Character c:t.toCharArray())
	{
		
		if(c=='#')
		{
			st1.pop();
			continue;
		}
		else
			
			st1.push(c);
	}
	String op="";
	for(Character ch:st1)
	{
		op=op+ch;
	}
	return op;

}
}


