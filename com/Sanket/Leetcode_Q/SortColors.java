package Sanket.com.Sanket.Leetcode_Q;

import java.util.ArrayList;

public class SortColors {
    public static void  main(String[] args) {
        int nums[]={0,1,1,2,0,1,2};
        System.out.println(sortColors(nums));
    }

    private static ArrayList<Integer> sortColors(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                list.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                list.add(nums[i]);

            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==2)
            {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
