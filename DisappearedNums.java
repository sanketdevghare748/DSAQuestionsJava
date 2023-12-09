package Sanket;

import java.util.Arrays;

/* Q: Given array an which is supposed to have the all numbers from 1 to N, but it has few numbsers missing.
find those numsbers.
For ex. Rang of array is 1 to 5. Expected array = [1,2,3,4,5]
Given array= [2,4,2]  now here the missing numbers are [1,3,5] -->This is the answer.
 */
public class DisappearedNums {
    public static void main(String[] args) {
        int range=5;
        int arr[]= {2,4,2};
        System.out.println(Arrays.toString(missingNums(arr,range)));
    }

    //approach:
    //The use of cyclic sort will be useful here.

}
