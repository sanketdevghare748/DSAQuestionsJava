package com.Sanket.Leetcode_Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/3sum/
		int nums [] = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
		//Output: [[-1,-1,2],[-1,0,1]]

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> result= new ArrayList<>();
		for(int i=0;i<nums.length&& nums[i]<0;i++)
		{
			if(i==0 || nums[i]==nums[i-1])
			{
				twosum2(nums,i,result);
			}
		}
			System.out.println(result);
		return result;
	}

	public static void twosum2(int[] nums, int i, List<List<Integer>> result) {
		// TODO Auto-generated method stub
		int left=i+1;
		int right=nums.length-1;
		
		while(left<right)
		{
			int sum=nums[i]+nums[left]+nums[right];
			 if(sum<0)
	            {
	                left++;
	            }
	            else if (sum>0)
	            {
	                right--;
	            }
	                
	            else
	            {
	                result.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
	                while(left<right && nums[left]==nums[left-1])
	                    ++left;
	            }
	        }
		}
		
	}
