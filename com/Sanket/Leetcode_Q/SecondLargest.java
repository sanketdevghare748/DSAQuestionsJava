package com.Sanket.Leetcode_Q;
//Find second largest element of the array.

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,4,2,15,6,2,9,9,10,10,17,15};
        System.out.println(secLargest(arr));
        //System.out.println(arr[secLargest(arr)]);

    }

    private static int secLargest(int[] arr) {
        int max=0;
        int secondMax=0;
        int i=0;
        int j=0;
        for(i=0;i<arr.length;i++)
        {
            if(max<=arr[i])
            {
                max=arr[i];
            }
        }
        //To get second max

        for (j=0;j< arr.length;j++)
        {
            if(secondMax<=arr[j]  && arr[j]<max)
            {
                secondMax=arr[j];
            }
        }
        return secondMax;

       //return secondMax;
    }

}
