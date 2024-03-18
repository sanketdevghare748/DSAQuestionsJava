package Sanket.Oops_Concept;

import java.util.ArrayList;
import java.util.Arrays;

public class testcode1 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 6, 8, 9};
//        try {
            System.out.println(pairremoved(arr));
//        }
//        catch (Exception b) {
            //System.out.println("Something wrong happened with your function");
//        }

    }

        private static ArrayList<Integer> pairremoved ( int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> finalAns = new ArrayList<>();

        //Exception for 1

        for (int i = 0; arr[i] * arr[i] <= arr[arr.length - 1]; i++) {
            if((arr[i]==0 || arr[i]==1))
            {
                finalAns.add(arr[i]);
                continue;
            }
            //Inner loop
            int base = arr[i];
            int power = 1;
            int temp = 0;

            while (temp <= arr[arr.length - 1]) {
                temp = calculatePower(base, power);
                if (isExists(arr, temp)) {
                    if (!list.contains(temp)) {
                        list.add(temp);
                    }
                    power++;
                }
            }
        }
        //now show only those element in a new list from array if it does not exists in the ans.
        for (int num=0;num<arr.length-1;num++) {
            if (!list.contains(arr[num])) {
                finalAns.add(arr[num]);
            }
        }
        return finalAns;
    }

        private static int calculatePower ( int base, int power){
        int ans = 1;
        while (power > 0) {
            ans = ans * base;
            power--;
        }
        return ans;

    }

        private static boolean isExists ( int[] arr, int temp){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                return true;
            }
        }
        return false;
    }
    }

