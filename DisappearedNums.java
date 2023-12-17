package Sanket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* Q: Given array an which is supposed to have the all numbers from 1 to N, but it has few numbsers missing.
find those numsbers.
For ex. Rang of array is 1 to 5. Expected array = [1,2,3,4,5]
Given array= [2,4,2]  now here the missing numbers are [1,3,5] -->This is the answer.
 */
public class DisappearedNums {
    public static void main(String[]args) {
        int[] arr = {2, 4, 2};

        System.out.println(findDisappearedNumbers(arr));
    }

        static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length-1) {
            int correct = nums[i] - 1;
            //int correct = nums[i];// when the series is starting from 0.
            /*if n comes in the array skip it as it can not be mapped in the array because the length of expected array is always smaller
            than the given array*/
            if ( i< nums.length-1 && correct != i) {
                swap(nums, i, correct);
            } else
                i++;
        }
        //Now my array is sorted.Check for the missing number by comparing the index value of the element and the element value is equal.
        //Return the index where its not
        //case2: if the array given has no "n" then after sorting all the elements will be at their correct position but still"n" is missing
        // Hence return directly "n".
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
