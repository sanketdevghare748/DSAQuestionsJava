package Oops_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

//Q: given an  array,  take all those numbers and put all the zeroes at the start and then put all the element in the same order as it is.
//For Ex : [1,0,2,3,0,5,0] op: [0,0,0,1,2,3,5]
public class TrailingZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 0, 5, 0, 8, 2};
        //System.out.println(Arrays.toString(trailingzeros(nums)));
        System.out.println(trailZeroes(nums));
        
    }

    private static int[] trailZeroes(int[] nums) {
		// TODO Auto-generated method stub
		List <Integer> ts= new ArrayList<>();
		for(int i: nums)
		{
			if(i!=0)
			ts.add(i);
		}
		for(int i: nums)
		{
			if(i==0)
			ts.add(i);
		}
		
		
	System.out.println(ts);
	return null;
	}

	private static int[] trailingzeros(int[] nums) {
        int arr[] = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

        for (int i = 0; i < count - 1; i++) {
            //In outer loop We are rotating the array by 3 times.
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                //In inner for loop we Shift all elements of array by one
                arr[j] = arr[j - 1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }
        return arr;
    }
}
