package Sanket;
//To find the element in an infinite array.
public class InfiniteArray {
    public static void main(String[] args) {
     int [] arr={1,2,3,4,5,6,8,10,12,45,64};
     int target=4;
        System.out.println(ans(arr,target));
    }
    static int ans (int [] arr, int target)
    {
        //Find the range.
        int start=0;
        int end=1;

        while (target>arr[end])
        {
            int newstart=end+1;
            end=end +(end+1-start)*2;
            start=newstart;
        }
        return BinarySearchEx(arr,target,start,end);
    }
    static int BinarySearchEx(int[]arr, int target, int start,int end)
    {
        //intialise start= first element , end=last element
        //int start= 0;
        //int end=arr.length-1;
        //Always start value should be less than end value.
        while (start<=end)
        {
            int mid=(start+ (end-start)/2);
            // check for the three conditions:

            if(target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
            else {
                //ans found
                return mid;

            }

        }
        //not found the exact target return -1
        return -1;
    }
}

