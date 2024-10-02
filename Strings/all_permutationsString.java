package Strings;

import java.util.ArrayList;
import java.util.List;

public class all_permutationsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "bat"; //
		//getAllPermutations(str, "");
		getAllSubstrings(str,"");

	}

	private static void getAllSubstrings(String str, String string) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
		
	}

	private static void getAllPermutations(String str, String result) {
		// TODO Auto-generated method stub

		if (str.isEmpty()) {
			System.out.println(result);

			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String rem = str.substring(0, i) + str.substring(i + 1);
			getAllPermutations(rem, result + c);

		}

	}

}
