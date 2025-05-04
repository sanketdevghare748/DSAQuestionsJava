package InterviewQues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Alphanumeric_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "sanket";
	    //System.out.println(isAlphanumeric(str));
	    String str1="tessnkeatm";
	    System.out.println(isSameLetter(str,str1));
	}

	private static boolean isSameLetter(String str, String str1) {
		// TODO Auto-generated method stub
		TreeSet<Character> strset= new TreeSet<Character>();
		TreeSet<Character> str1set= new TreeSet<Character>();
		for(char ch: str.toCharArray())
		{
			strset.add(ch);
			
		}
		for(char ch1: str1.toCharArray())
		{
			str1set.add(ch1);
			
		}
		System.out.println(str1set);
		System.out.println(strset);
		if(strset.equals(str1set))
		{
			return true;
		}
		
		return false;
	}

	private static boolean isAlphanumeric(String str) {
		// TODO Auto-generated method stub]
		String regex= "^[a-zA-Z0-9]*$";
		if(str.matches(regex))
		{
			return true;
		}
		return false;
	}

}
