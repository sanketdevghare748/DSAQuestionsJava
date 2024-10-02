

import java.util.Arrays;

//import static Sanket.Linsersearch.swap;

public class CyclicSort {
    public static void main(String[] args) {
        //int [] arr={5,4,2,3,1};
        // if the series is starting from 0
        int [] arr={5,4,2,3,1,0};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            //int correct=arr[i]-1;
            int correct=arr[i];// when the series is starting from 0.
            if(correct!=i) {
                swap(arr,i,correct);
            }
            else
                i++;
            }
    }
    static void swap(int[] arr, int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}




