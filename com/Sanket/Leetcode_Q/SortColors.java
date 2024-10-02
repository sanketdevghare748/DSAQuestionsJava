package com.Sanket.Leetcode_Q;
//https://leetcode.com/problems/sort-colors/submissions/1208299607
import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int nums[] = {0, 1, 1, 2, 0, 1, 2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        //System.out.println(sortColors(nums));
    }

    private static void sortColors(int[] nums) {
        //Approach:using an empty list
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list.add(nums[i]);
                nums[i] = 0;
            }

        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                list.add(nums[i]);
                nums[i] = 0;
            }

        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                list.add(nums[i]);
                nums[i] = 0;
            }

        }
        for (i = 0; i < nums.length - 1; i++) {
            nums[i] = list.get(i);
        }
    }
}
