package Sanket;
//This file needs to be adeded to git.
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,0,-1,-2,-4};
        System.out.println(Arrays.toString(arr));
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortBubble(int[] arr) {
        boolean swapped=false;
        int temp = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break; //If the array is already sorted then we will not check further as in first internal loop there is no swap occured.
            }
        }
    }

}
