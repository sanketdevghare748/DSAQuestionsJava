package Strings;

public class Alphanumeric {
	
	    public static void main(String[] args) {
	        String str = "123";
	        System.out.println(isAlphanumeric(str));
	        
	    }

	    public static boolean isAlphanumeric(String str) {
	        return str.matches("[A-Za-z0-9]+");
	    }
	    
	   
	}


