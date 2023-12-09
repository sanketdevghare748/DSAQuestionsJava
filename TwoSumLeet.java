package Sanket;
import java.util.*;
// there  is a update dfor
public class TwoSumLeet {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3,4,3,4};
        int target=8;

        System.out.println(Arrays.toString(twoSum(arr1,8)));
    }
        public static int[] twoSum(int[] nums, int target) {
            int arr[]= new int[2];
            for(int i=0;i<nums.length;i++)
            {
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i]==nums[j] && (i==j)) {
                        continue;}
                    if(nums[i] + nums[j] == target) {

                            arr[0] = j;
                            arr[1] = i;
                        }
                    }
                }

            return arr;
        }
    }

