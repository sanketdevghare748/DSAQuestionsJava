package com.Sanket.Leetcode_Q;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			String s [] ={"Sanket" ,"sAnket" , "saNee"};
//			SAN
//			String s[] ={"Sanket" ,"sAnket" , "sanee"};
//			SAn
			
			for(int i=1;i<s.length;i++)
			{
				for (int j=0;j<s[i].length();j++)
				{
					char c=s[0].charAt(j);
					if(isPresent(s[i],c))
					{
						continue;
					}
					
				}
			
			}
	}

	private static boolean isPresent(String in, char c) {
		// TODO Auto-generated method stub
		for(char c:in.toCharArray())
		{
			if()
		}
	}

	private static String rev(String op, String a) {
		// TODO Auto-generated method stub
		if(a.isBlank())
		{
			return op;
		}
		op=op+a.charAt(a.length()-1);
		a=a.substring(0,a.length()-1);
		
		return rev(op,a);
	}

}




