public class RotatedBS {
    public static void main(String[] args) {
        int [] arr= {5,6,7,2,3,4};
        int target=7;
        int ans= FindAns(arr,target);
        System.out.println(ans);

    }

    static int PivotIndex(int[] arr)
    {
        int start=0;
        int end= arr.length-1;
        while (start<=end)
        {
            int mid= (start + (end-start))/2;
            if(mid<end && (arr[mid]<arr[mid-1]))
            {
                return mid;
            }
            //case 2:
            if(mid>start && (arr[mid]>arr[mid+1]))
            {
                return mid-1;
            }
            //case 3:
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return -1; // if there is no pivot means array is not rotated anymore.
    }
    static int FindAns(int [] arr, int target)
    {
        int pivot= PivotIndex(arr);
        //Case 1: if my Pivot is -1, means no rotated array hence normal binary search on entire array.
        if(pivot==-1)
        {
            return BinarySearch(arr,0,arr.length-1,target); //Normal binary search because no pivot means array is not rotated.
        }
        if(target==arr[pivot])
        {
            return pivot;
        }
        if(target>=arr[0]) //means I have to check only first ascending array from Start till piot
        {
            return BinarySearch(arr,0, pivot-1,target);
        }
        else {
            //search in second ascending array from start=Pivot+1, end=arr.length-1;
            return BinarySearch(arr,pivot+1,arr.length-1,target);
        }
        //return -1; //if target is not found.
    }
    static int BinarySearch(int []arr, int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=(start+(end-start))/2;
            //Again 3 cases of normal biary search:
            //Case 1:
            if (arr[mid]==target)
            {
                return mid;
                //answer found ,so return index value of answer ie.mid
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
        }
        return -1; //If the element is not found.
    }
}
