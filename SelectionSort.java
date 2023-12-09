package Sanket;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr= {1,3,2,0,-4,-6};
        System.out.println(Arrays.toString(arr));
        sortSelection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortSelection(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            int lastIndex = arr.length-1-i;
            int MaxIndex= getMaxIndex(arr,0,lastIndex);
            swap(arr,MaxIndex,lastIndex);

        }
    }

    static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp=arr[lastIndex];
        arr[lastIndex]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int MaxIndex=0;
        for(int i=start; i<=end;i++)
        {
            if(arr[i]>=arr[MaxIndex])
            {
                MaxIndex=i;

            }
        }
        return MaxIndex;
    }
}
