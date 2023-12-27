package Sanket.Recursion;

public class Recursion_BS {
    public static void main(String[] args) {
        int [] arr={15,3,2,5,9};
        int target=1;
        int ans=searchRec(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int searchRec(int [] arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1; //no element found
        }

        int mid=s+(e-s)/2;

        if(arr[mid]>target)
        {
            return searchRec(arr,target,s,mid-1);
        }
        if(arr[mid]<target)
        {
            return searchRec(arr,target,mid+1,arr.length-1);
        }
        if(arr[mid]==target)
        {
            return mid;
        }
        return -1;

    }
}
