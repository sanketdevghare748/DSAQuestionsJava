package Sanket.Recursion;

public class Array_Sort {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr,int index) {
        if(index==arr.length-1)
            return true;
        else
            return (arr[index] <arr[index+1]) && isSorted(arr, index+1);

    }
}
