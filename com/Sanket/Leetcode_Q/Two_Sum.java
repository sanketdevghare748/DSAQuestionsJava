package com.Sanket.Leetcode_Q;

import java.util.*;
import java.util.Map.Entry;

public class Two_Sum {
	public static List<int[]> findTwoSumAllPairs(int[] nums, int target) {
      List<int[]> result= new ArrayList<>();
      HashMap<Integer,Boolean> map=  new HashMap<>();
      
      for(int i:nums)
      {
    	  int comp=target-i;
    	  if(map.containsKey(comp))
    	  {
    		  result.add(new int[] {i,comp});
    	  }
    	  map.put(i, true);
      }

      return result;
      
      
      
	}
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 7, -1, 8,5,2};
        int target = 7;
        //List<int[]> pairs = findTwoSumAllPairs(nums, target);
        
//        for (int[] pair : pairs) {
//            System.out.println(pair[0] + ", " + pair[1]);
        
        System.out.println(getAllPairs(nums, target));
        }
    
    
    //
    public static List<List<Integer>> getAllPairs(int []arr, int target)
    {
      List <List<Integer>> list= new ArrayList<>();
      HashMap <Integer,Boolean> map= new HashMap<>();
      for (int i:arr)
      {
        map.put(i,false);
      }
      
      for(int j=0;j<arr.length;j++)
      {
        int comp=target- arr[j];
        if(map.containsKey(comp) && map.get(comp)==false)
        {
         list.add(Arrays.asList(arr[j],comp));
          map.put(arr[j],true);
          map.put(comp,true);
        }
        //System.out.println(map);
      }
      return list;
    }

}
