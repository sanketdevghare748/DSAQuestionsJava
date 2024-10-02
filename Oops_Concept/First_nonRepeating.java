package Sanket.Oops_Concept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* find the first non repeating character of the given string.
"
 */
public class First_nonRepeating {
    public static void main(String[] args) {
        String str="ramanumara";
        System.out.println(getfirstNonRepeasting_Char(str));
        //calculate the frequency of repeated letter.
        String str2= "aaabbcccddFFFFFx__";
        System.out.println(getfreq(str2));

    }

    private static HashMap<Character, Integer> getfreq(String str2) {

        int count=0;
        HashSet <Character> hs=new HashSet<Character>();
        HashMap <Character,Integer> map= new HashMap<Character, Integer>();

        for(int i=0;i<str2.length()-1;i++)
        {
            hs.add(str2.charAt(i));
        }
        //now calculate freq for each character
        Iterator <Character> iterator= hs.iterator();
        while(iterator.hasNext())
        {
            char ch=iterator.next();

            for(int j=0;j<=str2.length()-1;j++)
            {
                if(str2.charAt(j)==ch)
                {
                    count++;

                }

            }
            map.put(ch,count);
            count=0;


        }
        return map;

    }

    private static char getfirstNonRepeasting_Char(String str) {
        char [] charArr= str.toCharArray();

        for(int i=0;i<str.length()-1;i++)
        {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
            {
                return str.charAt(i);
            }
        }
        return '1';
    }
}
