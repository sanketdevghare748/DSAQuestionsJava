package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Q: Given a  string with some letters are repeated multiple time, find the index of the first letter from start which has
not repeated throughout the entire string.
For ex. "Leetcode"  here,ans=0 as "l" is the first letter which is not repeated.
2. "Loveleetcode" here ans= 2, "V" is the first letter which is not repeated.
 */
public class First_nonRepeating {
    public static void main(String[] args) {
        String s= "loveleetcode";
        //System.out.println(isRepeated(s));
        separateEvenOdd();
    }
    static int isRepeated(String s)
    {
        for(int i=0; i<s.length();i++)
        {
            int c=s.charAt(i);
            if(c==s.charAt(s.indexOf(c)) && c==s.charAt(s.lastIndexOf(c)))
            {
                return i;
            }

        }
        return -1;
    }


    public static void  separateEvenOdd()
    {
        List <Integer> list= Arrays.asList(1,3,5,6,7,8,10,12);
        List <Integer> even=new ArrayList<>();
        List <Integer> odd=new ArrayList<>();
        for(int i:list)
        {
            if(list.get(i) %2==0)
            {
                even.add(list.get(i));

            }
        }
        System.out.println(even);
    }


}
