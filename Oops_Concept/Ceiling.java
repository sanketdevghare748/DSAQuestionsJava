package Oops_Concept;

    public class Ceiling {

        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 9, 14, 16, 18};
            int target = 15;
            int ans = ceiling(arr, target);
            System.out.println(ans);
        }

        // return the index of smallest no >= target
        static int ceiling(int[] arr, int target) {

            // but what if the target is greater than the greatest number in the array
            if(target >arr[arr.length-1])
            {
                return -1;

            }
            int start=0;
            int end =arr.length-1;

            while(start<=end)
            {
                int mid=start+(end-start)/2;

                if(arr[mid]==target)
                {
                    return mid;
                }
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
            }
            return end;
        }
    }

