package InterviewQues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairwiseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6};
		//op={2,1,4,3,6,5}
		//Rotate by 3 times {4,5,6,1,2,3}
		//swapPairs(arr);
		
		rotateBykTimes(arr,23);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateBykTimes(int[] arr, int k) {
		// TODO Auto-generated method stub
		if(k<0 || k==0)
		{
			return;
		}
		else
		{
			int count=k%arr.length;
			int [] arr1=new int[arr.length];
			arr1= Arrays.copyOfRange(arr,arr.length-count,arr.length);
			System.out.println(Arrays.toString(arr1));
			
			int [] arr2=Arrays.copyOfRange(arr,0,arr.length-count);
			System.out.println(Arrays.toString(arr2));
			
			// Create a new array to hold the concatenated result
	        int[] concatenatedArray = new int[arr1.length + arr2.length];

	        // Copy elements from first array
	        System.arraycopy(arr1, 0, concatenatedArray, 0, arr1.length);

	        // Copy elements from second array
	        System.arraycopy(arr2, 0, concatenatedArray, arr1.length, arr2.length);

	        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
		}
		
		
	}

	public static void swapPairs(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++)
		{
			swap(arr,i,i-1);
			i++;
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
