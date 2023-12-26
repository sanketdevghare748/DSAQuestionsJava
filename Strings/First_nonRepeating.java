package Sanket.Strings;
/* Q: Given a  string with some letters are repeated multiple time, find the index of the first letter from start which has
not repeated throughout the entire string.
For ex. "Leetcode"  here,ans=0 as "l" is the first letter which is not repeated.
2. "Loveleetcode" here ans= 2, "V" is the first letter which is not repeated.
 */
public class First_nonRepeating {
    public static void main(String[] args) {
        String s= "loveleetcode";
        System.out.println(isRepeated(s));
    }
    static int isRepeated(String s)
    {
        for(int i=0; i<s.length();i++)
        {
            int c =s.charAt(i);
            if(c==s.charAt(s.indexOf(c)) && c==s.charAt(s.lastIndexOf(c)))
            {
                return i;
            }

        }
        return -1;
    }



}
