package Sanket.Oops_Concept;

import java.util.Arrays;

public class tes2 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 0, 3, -1, 2, 6};

        int target = 1;
        System.out.println(Arrays.toString(func(nums, target)));

    }
    static  int [] func(int [] nums, int target){
        int[] result = new int[4];
        for ( int i =0; i<nums.length;i++)
        {
            //Internal loop
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;

                    return result;
                }
            }
        }
        return new int[]{-1,-1};

        //System.out.println(Arrays.toString(result));
    }


}
