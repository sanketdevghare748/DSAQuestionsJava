package Strings;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       String a = "ABC";
		        String b = "DEFGH";
		        int length= Math.min(a.length(),b.length());
		        String c="";
		    for(int i=0;i<length;i++)
		        {
		        
		           c=c+a.charAt(i)+b.charAt(i);
		            
		        }
		        System.out.println(c);
		        if(a.length()>b.length())
		        {
		            c=c+a.substring(length,a.length());
		            
		        }
		        else
		        {
		            c=c+b.substring(length,b.length());
		        }
		        System.out.println(c);
		    }
		
	}