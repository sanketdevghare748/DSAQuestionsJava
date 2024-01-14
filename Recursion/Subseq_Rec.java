package Sanket.Recursion;
//Q:print all the subsequences formed by the string : "abc".

import java.util.ArrayList;

public class Subseq_Rec {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<String>();
        System.out.println(subseq("","abc",list));
    }

    private static ArrayList <String> subseq(String p, String up, ArrayList<String> list) {
        //Base condition, if my unprocessed is empty then print processed and return.
        if(up.isEmpty())
        {

            //System.out.print(p);
            list.add(p);
            return list;

        }
        char ch= up.charAt(0);

        //Two recursive calls for function to take it and to ignore it.

        subseq(p,up.substring(1),list); //Ignore it.

        subseq(p+ch,up.substring(1),list); //Take it.
        return list;
    }
}
