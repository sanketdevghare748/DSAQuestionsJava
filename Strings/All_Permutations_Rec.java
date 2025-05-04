package Strings;

public class All_Permutations_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bat";
		//op : bat,atb,tab,bta,abt,tba
	        System.out.println("Permutations of " + str + " are:");
	        getPermutations(str, "");
	    }
	public static void getPermutations(String str, String ans) {
        // Base condition: If string is empty, print the result
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            // Extract the current character
            char ch = str.charAt(i);

            // Remaining string after removing the picked character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recurse with the new remaining string and updated answer
            getPermutations(remaining, ans + ch);
        }
    }

	}
