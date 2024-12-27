package com.Sanket.Leetcode_Q;

import java.util.Arrays;

public class IndexFirstOccuance {
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
	//Q: Find occurance of first index of needle in haystack.
	//Input: haystack = "sadbutsad", needle = "sad"
			//Output: 0
	    public static void main(String[] args) {
	        String haystack = "sbdutsad";
	        String needle = "sad";
	      Arrays.sort(needle.toCharArray());
	      
	        System.out.println(strStr(haystack, needle));
	    }

	    private static int strStr(String haystack, String needle) {
	        if (needle.isEmpty()) {
	            return 0; // If needle is empty, return 0 as per problem convention
	        }

	        int length = needle.length();
	        for (int i = 0; i <= haystack.length() - length; i++) {
	            String temp = haystack.substring(i, i + length);
	            if (temp.equals(needle)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}


