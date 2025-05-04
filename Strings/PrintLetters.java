package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintLetters {

	public static void main (String[] args) throws java.lang.Exception
	{
	    String input="a2b3c4";
	    //op:aabbbcccc
	    System.out.println(getFull(input));
	    System.out.println(getShortString(getFull(input)));
	    
	}
	
	public static String getFull(String input)
	{
	    String op="";
	    for(int i=0;i<=input.length()-1;i++)
	    {
	        
	        char ch= input.charAt(i);
	        if(Character.isDigit(ch))
	        {
	            int count=Integer.parseInt(Character.toString(ch));
	            while(count>0)
	            {
	                op=op+input.charAt(i-1);
	                count--;
	            }
	        }
	    }
	    return op;
	}
	
	public static String getShortString(String op)
	{
		String input="";
		
		HashMap <Character,Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<op.length();i++)
		{
			map.put(op.charAt(i),map.getOrDefault(op.charAt(i),0)+1);
		}
		for(Entry<Character,Integer> entry:map.entrySet())
		{
			input=input+entry.getKey().toString()+entry.getValue().toString();
		}
			return input;
	}
}
