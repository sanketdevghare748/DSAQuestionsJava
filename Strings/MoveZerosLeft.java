package Strings;

import java.util.LinkedList;

public class MoveZerosLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Move all zeroes to left and maintain the order. op=[2,3,1,4,5,0,0,0]
		int [] arr= {2,0,3,1,4,0,5,0,0};
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				list.addFirst(arr[i]);
			}
			else
			{
				list.addLast(arr[i]);
			}
		}
		
		System.out.println(list);
		
		
		//Problem2:Check if the given String is alphanumeric with all edge cases.
		
		String str="&&";
		System.out.println(isAlphanumeric(str));
	}

	private static boolean isAlphanumeric(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty())
		{
			return null != null;
		}
		boolean hasDigit=false;
		boolean hasCharacters=false;
		for(char c:str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				hasDigit=true;
			}
			else if(Character.isAlphabetic(c))
			{
				hasCharacters=true;
			}		
		}
		return (hasCharacters && hasDigit);				
	}

}
