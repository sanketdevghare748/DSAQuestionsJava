package Strings;

public class isPalindrome {
//
	public static void main(String[] args) {
		String str= "mamdm";
		String p="This is me and my name is Sanket";
		System.out.println("is palidrome? : "+ isPalindrome(str));
		System.out.println("reverse of given string "+str+" : "+reverse(str));
		System.out.println("String after spaces removed : "+ removeAllSpace(p));
	}

private static String removeAllSpace(String str) {
	// TODO Auto-generated method stub
	String s="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			s=s+str.charAt(i);
			
		}
	}
	return s;
}

private static String reverse(String str) {
	// TODO Auto-generated method stub
	String s="";
	for(int i=str.length()-1;i>=0;i--)
	
	{
		s=s+str.charAt(i);
	}
	
	return s;
}

private static boolean isPalindrome(String str) {
	// TODO Auto-generated method stub
	int start=0;
	int end= str.length()-1;
	while(start<end)
	{
		if(str.charAt(start)!=str.charAt(end))
		{
			return false;
		}
		start++;
		end--;
	}
	return true;
}
}
