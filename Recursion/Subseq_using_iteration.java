package Sanket.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subseq_using_iteration {
    public static void main(String[] args) {
        int []arr= {1,2,3};
        List<List<Integer>> ans= subset(arr);
        for(List<Integer> list:ans)
        {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer =new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal =new ArrayList<>(outer.get(i));
                //This will create the copy of the arraylist from prev step and then we are adding the arraylist with the new arraylist created by adding the element.

                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
//    private static List<List<Integer>> subsetDuplicate(int[] arr) {
//        List<List<Integer>> outer =new ArrayList<>();
//
//        outer.add(new ArrayList<>());
//        int start=0;
//        int end =0;
//
//        for (int i=0;i<arr.length;i++) {
//            start = 0;
//            //if there is no duplicate.
//            if (i > 0 && arr[i]==arr[i-1])
//            {
//                start=end+1;
//
//            }
//            end=outer.size()-1;
//        }
//            int n=outer.size();
//            for(int i=0;i<n;i++)
//            {
//                List<Integer> internal =new ArrayList<>(outer.get(i));
//                //This will create the copy of the arraylist from prev step and then we are adding the arraylist with the new arraylist created by adding the element.
//
//                internal.add(num);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }
}
//Space complexity=O(n*2^n)
//Time complexity=O(n*2^n)
