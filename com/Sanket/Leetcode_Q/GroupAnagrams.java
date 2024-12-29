package com.Sanket.Leetcode_Q;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		System.out.println(groupAnagrams(strs));

	}

	private static ArrayList<List<String>> groupAnagrams(String[] strs) {
		// TODO Auto-generated method stub
		HashMap<String, List<String>> map = new HashMap<>();
		for (String word : strs) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);
			if (!map.containsKey(sortedWord)) {
				map.put(sortedWord, new ArrayList<>());
			}

			map.get(sortedWord).add(word);
		}
		return new ArrayList<>(map.values());
	}
}
