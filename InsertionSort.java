

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr= {1,3,2,0,-4,-6};
        System.out.println(Arrays.toString(arr));
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortInsertion(int[] arr) {
        //int j=0;
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j= i + 1;j>0 ;j--)
            {
                if(arr[j]<arr[j-1]) // if my "j-1" element is greater than "j"th  element swap them to get in increasing order.
                {
                    swap(arr,j,j-1);
                }
                else // if already in increasing order, just break the internal loop.
                {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int j, int i) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
