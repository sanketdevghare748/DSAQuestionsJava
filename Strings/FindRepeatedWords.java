package Strings;
/* Q: Find the repeated words from the string and then display the word which is most repeated but the word repeated should not be banned.*/
//https://leetcode.com/problems/most-common-word/

import java.util.Arrays;

public class FindRepeatedWords {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        mostCommonWord(paragraph, banned);
        //System.out.println(mostCommonWord(paragraph, banned));
    }

    static String mostCommonWord(String paragraph, String[] banned) {
        // Get the words separated ib the form of arr of String
        String[] arr = (paragraph.toLowerCase()).split(" ");
        System.out.println(Arrays.toString(arr));
        int count = 1;
        //Got the array for words now iterate over it to each word repeat count.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if ((arr[i].equals(arr[j]))) {
                    count++;
                }


            }
            System.out.println("Word: " + arr[i] + " " + "Count " + count);

            count = 0;
        }
        return arr[1];
    }
}



