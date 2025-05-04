package InterviewQues;

import java.util.ArrayList;
import java.util.*;
public class TwoSumAllpairs {

	// Return all such unique pairs with the sum of
	public static void main(String args[]) {
		int sum = 8;
		int[] nums = { 1, 4, 7, 2, 4, 6, 5, 3, 9, 0, -1 };
		List<List<Integer>> op= new ArrayList<List<Integer>>();
		HashMap <Integer,Boolean> numsMap= new HashMap<Integer, Boolean>();
		for(int num:nums)
		{
			numsMap.put(num,false);
		}
		for (int i:nums) {
			
			int target=sum-i;
			if(numsMap.containsKey(target)&& numsMap.get(target)==false)
			{
				List<Integer> subop= new ArrayList<Integer>();
				subop.add(target);
				subop.add(i);
				op.add(subop);
				System.out.println(subop);
				numsMap.put(target,true);
				numsMap.put(i,true);
				
			}
			
			}
		System.out.println(op);
	}
}
