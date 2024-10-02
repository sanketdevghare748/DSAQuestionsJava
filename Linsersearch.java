

import java.util.Scanner;
import java.util.*;


public class Linsersearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,25,34,21,4,19,24};
        //Call a function:
        int index= FindTarget(arr,19,2,4);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
        //Function to reverse the array
        arr= Reversearray(arr);
        System.out.println(Arrays.toString(arr));


    }
    static  int  FindTarget(int[] arr1, int target,int start_Pos, int end_Pos) {
        //edge casese:
        if(arr1.length==0)
        return -1;
        if(arr1==null)
         return -1;

        for (int i =start_Pos; i <end_Pos; i++) {
            if (arr1[i] == target) {
                return i;
            }
        }

    return -1;
    }
    static int[] Reversearray(int[] arr2) {
        for (int i = 0; i <=(arr2.length)/2; i++) {
            //swap(arr2[i], arr2[(arr2.length - 1)-i]);
            int temp=arr2[i];
            arr2[i]=arr2[(arr2.length-1)-i];
            arr2[(arr2.length-1)-i]=temp;

        }
        return arr2;
    }

        static void swap(int a,int b){
            int temp=a;
            a=b;
            b=temp;
        }



    }


