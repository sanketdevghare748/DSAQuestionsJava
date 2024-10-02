package com.Sanket.Leetcode_Q;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

//https://leetcode.com/problems/sort-the-people/description/?envType=daily-question&envId=2024-07-22
public class Sort_The_People {
    public static void main(String[] args) {
        String [] names= {"Mary","John","Emma"};
        int [] heights={180,165,170};
        //System.out.println(sort(names,heights));
        System.out.println(maximumOddBinaryNumber("010"));
    }

    private static String [] sort(String[] names, int[] heights) {
        HashMap <Integer,String> map= new HashMap<>();
        for (int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Set<Integer> integers = map.keySet();
        Object[] arr =integers.toArray();

        String [] res= new String[integers.size()];
        for(int i=0;i<integers.size();i++)
        {
            res[i]=map.get(arr[i]);
        }
        return res;
    }
    public static String maximumOddBinaryNumber(String s) {
        String Str="";
        Stack<Character> stack= new Stack<>();

        char [] charArr= s.toCharArray();
        for(int i=0;i<charArr.length;i++)
        {
            if(charArr[i]=='0')
            {
                stack.push(charArr[i]);
            }
            if(charArr[i]=='1')
            {
                Str =Str+charArr[i];
            }

        }
        while(!stack.isEmpty())
        {
            Str=Str+stack.pop();
        }

        Str=exchangeCharacters(Str);
        return Str;
    }

    public static  String exchangeCharacters(String str) {
        String temp= str.substring(1);
        String  temp1=str.substring(0,1);
        return temp.concat(temp1);
    }
}
