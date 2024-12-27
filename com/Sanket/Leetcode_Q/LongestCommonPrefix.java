package com.Sanket.Leetcode_Q;

//https://leetcode.com/problems/longest-common-prefix/
/**
 * Input: strs = ["flower","flow","flight"] Output: "fl"
 **/

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"ab","a", "ac"}; // op should be 'fl"
		System.out.println("Longest Prefix:"+getLongestCommonPrefix(strs));
		System.out.println("Longest Suffix:"+getLongestCommonSuffix(strs));

	}

	private static String getLongestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		if (strs[0].isEmpty()) {
			return "The array is empty";
		}
		String temp1 = "";
		for (int i = 1; i <= strs[0].length() - 1; i++) {
			temp1 = strs[0].substring(0, i);
			for (String str : strs) {
				if (!str.startsWith(temp1)) {
					if (temp1.substring(0, temp1.length() - 1).isEmpty()) {
						return "No longest common substring";
					}
					return temp1.substring(0, temp1.length() - 1);
				}
			}

		}
		return "No longest common substring";
	}

	private static String getLongestCommonSuffix(String[] strs) {
		// TODO Auto-generated method stub
		if (strs[0].isEmpty()) {
			return "The array is empty";
		}
		String temp1 = "";
		for (int i = 1; i < strs[0].length(); i++) {
			temp1 = strs[0].substring(strs[0].length() - i);

			for (String str : strs) {
				if (!str.endsWith(temp1)) {
					if (temp1.substring(0, temp1.length() - 1).isEmpty()) {
						return "No longest common substring";
					}
					return temp1.substring(1);
				}
			}

		}
		return "No longest common substring";
	}

}
