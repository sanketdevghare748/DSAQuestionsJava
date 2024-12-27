package com.Sanket.Leetcode_Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_missing_num {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,4,5,7,6,9};
		
		//System.out.println(getMissingNumbers(arr));
		System.out.println(missingByCyclicSort(arr));
		

	}
	// Method to find missing numbers 
    private static List<Integer> missingByCyclicSort(int[] arr) throws Exception {
        List<Integer> op = new ArrayList<>();
        
        // Null and empty check
        if (arr == null || arr.length == 0) {
            throw new Exception("The array should not be null or empty.");
        }

	int i = 0;
    while (i < arr.length+1) {
        int correct = arr[i] - 1; // Correct index for the current number
        
        // Check if number is in the correct range and swap if needed
        if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
            swap1(arr, i, correct);
        } else {
            i++;
        }
    }
    
    // After sorting, check for missing numbers
    for (int k = 0; k < arr.length; k++) {
        if (arr[k] != k + 1) { // If the number at index 'k' is not 'k + 1'
            op.add(k + 1); // Add the missing number
        }
    }
    return op;
}

// Swap utility method
private static void swap1(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

	

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]= arr[j];
		arr[j]=temp;	
	}

	private static List<Integer> getMissingNumbers(int[] arr) {
		List <Integer> list= new ArrayList<>();
		List <Integer> op= new ArrayList<>();
		int [] arr2 = new int[arr[(arr.length-1)]];
		for(int i: arr)
		{
			list.add(i);
		}
		for(int i=0;i<arr[arr.length-1];i++)
		{
			arr2[i]=i+1;
			
		}
		
		for(int n:arr2)
		{
			if(!list.contains(n))
			{
				op.add(n);
			}
		}
		return op;
	}
	
	//Using cyclic sort, here correct= arr[i]=i+1 if now swap element at i with i+1;
	
	

}
