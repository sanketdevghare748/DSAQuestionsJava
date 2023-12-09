package Sanket;
import java.util.*;
//This code needs to be reworked again
public class PeakElementArray {
    public static void main(String[] args) {
     int [] arr= {1,2,3,5,6,8,7,4,-1};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr)
    {
        int start=0;
        int end =arr.length-1;
        {
            //Condition 1: Check if arr[mid]>start --> the answer lies in left.
            //hence start=mid+1
            while (start<end) {

                int mid= (start+end)/2;

                if (arr[mid] > arr[mid+1]) {
                    end=mid;
                }
                else
                {
                    start=mid+1;
                }
                //condition 2: check if arr[mid]<arr[star] {1,2,3,4,3,2}
            }
        }
        return  end;
    }
}
