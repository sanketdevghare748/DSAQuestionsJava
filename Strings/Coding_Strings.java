package Sanket.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Coding_Strings {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/insert-a-string-into-another-string-in-java/
        String originalString = "bat" ;
        String stringToBeInserted = "mara";
        int index = 0;

        System.out.println("Original String: "
                + originalString);
        System.out.println("String to be inserted: "
                + stringToBeInserted);
        System.out.println("String to be inserted at index: "
                + index);
        System.out.println("Final output String="+addStringAt(originalString,stringToBeInserted,index));

        //Quesion 2:Check if the given strings are anagram
        System.out.println("The given strings are anagram? -->"+ isAnagram(originalString,stringToBeInserted));

        //Question 3: Get all the substrings for the given string
        System.out.println("All substrings of "+ originalString+" "+ getAllSubstring(originalString));
    }

    private static ArrayList<String > getAllSubstring(String originalString) {
        ArrayList <String> list= new ArrayList<>();
        for(int i=0;i<originalString.length()-1;i++)
        {
            for(int j=i+1;j<=originalString.length();j++)
            {
                String str=originalString.substring(i,j);
                list.add(str);
            }
        }
        return list;
    }

    private static boolean isAnagram(String originalString, String stringToBeInserted) {
        char [] str1Arr= originalString.toCharArray();
        char[] str2Arr=stringToBeInserted.toCharArray();
       Arrays.sort(str1Arr);
       Arrays.sort(str2Arr);
        System.out.println(str1Arr);
        System.out.println(str2Arr);
       return (Arrays.equals(str1Arr,str2Arr))  ;

    }

    private static String addStringAt(String originalString, String stringToBeInserted, int index) {
        String finalOp1=originalString.substring(0,index+1);
        String finalOp2=originalString.substring(index+1,originalString.length());
        return finalOp1+stringToBeInserted+finalOp2;
    }
}
