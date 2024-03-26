package Sanket;

//Ascending order sorted array.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 8};
        int target = 8;
        int ans = BinarySearchEx(arr, target);
        System.out.println(ans);
    }

    static int BinarySearchEx(int[] arr, int target) {
        //Intialise start= first element , end=last element
        int start = 0;
        int end = arr.length - 1;
        //Always start value should be less than end value.
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            // check for the three conditions:

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                //ans found
                return mid;

            }


        }
        //not found the exact target return -1
        return -1;
    }
}
