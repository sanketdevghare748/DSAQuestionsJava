package Sanket;

import java.util.Arrays;
//This is sample leetcode question
//Q: find the missing number in a given range for ex, [0,3] --> [0,2,1] but here 3 is missing as the series will be till 3 from 0
//answer=3;
public class MissingNumber {
    public static void main(String[] args) {
        //int [] arr={5,4,2,3,1};
        // if the series is starting from 0
        int[] arr = {4, 3, 2, 1, 0};
        int n = 5;
        System.out.println(missingNumber(arr, n));
    }

    static int missingNumber(int[] arr, int n) {
        //this will sort the arr given.
        int i = 0;
        int missingNum = 0;
        while (i < arr.length) {
            //int correct=arr[i]-1;
            int correct = arr[i];// when the series is starting from 0.
            /*if n comes in the array skip it as it can not be mapped in the array because the length of expected array is always smaller
            than the given array*/
            if (arr[i] < n && correct != i) {
                swap(arr, i, correct);
            } else
                i++;
        }
        //Now my array is sorted.Check for the missing number by comparing the index value of the element and the element value is equal.
        //Return the index where its not
        //case2: if the array given has no "n" then after sorting all the elements will be at their correct position but still"n" is missing
        // Hence return directly "n".
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                missingNum = j;
                break; //
            } else {
                missingNum = n;
            }
        }
        return missingNum;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

