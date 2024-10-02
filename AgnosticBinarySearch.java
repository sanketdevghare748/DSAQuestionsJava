
import java.util.*;
//Works for any array whether its ascending sorted or descending sorted.
public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr=new int[] {0,1,1,2,3,4,5,6,1};
        int target=6;
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
        //Addig the code for  the
//       System.out.println(Arrays.toString(arr));
        int ans= AgnosticSearch(arr,target);
        System.out.println(ans);
    }
    static int AgnosticSearch(int[] arr, int target)
    {
        // if my array is sorted in ascending or descending order.
        boolean isAscend=true;
        if(arr[0]<arr[arr.length-1]){
            isAscend=true;
        }
        else
        {
            isAscend=false;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid =start+ (end-start)/2 ;
            // check for common conditions in bothe ie. mid= target;
            if(target==arr[mid]){
                //answer found return mid;
                return mid;
            }
            // Run if my array is ascending
            if (isAscend)
            {
                if(target>arr[mid])
                start=mid+1;
                else {
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]) // if target less than mid we have to shift towards right hence, start=start+1
                    start=mid+1;
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}


