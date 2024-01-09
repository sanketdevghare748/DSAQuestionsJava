package Sanket.Recursion;

import java.util.Arrays;

public class Rec_merge_Sort {
    /* Q: Merge sort using the recursion.
    Approach: Divide and Conquer, first divide the array in 2 parts, sort them and then merge them together to form the
    one array.
     */
    public static void main(String[] args) {
        int arr[]={1,4,2,3,5,6,8,12,2,7,0};
        int ans []=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] arr) {
        //first base condition for recursion of the arr
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;

        int [] right= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] left= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(right,left);
    }

    private static int[] merge(int[] right, int[] left) {
    int i=0;
    int j=0;
    int k=0;
    int [] mixed=new int [right.length +left.length];
    while(i<right.length && j<left.length)
    {
        if(right[i]<left[j])
        {
            mixed[k]=right[i];
            i++;
        }
        else
        {
                mixed[k]=left[j];
                j++;
            }
        k++;
        }
 //If the length of the two divided array is not the same then add the remaining elements directly at the end.
        while(i<right.length)
        {
            mixed[k]=right[i];
            i++;
            k++;
        }
        while(j<left.length)
        {
            mixed[k]=left[j];
            j++;
            k++;
        }
        return mixed;
    }

}
