

import java.util.Arrays;

public class Missing_Repeated {
    public static void main(String[] args) {
        int [] arr= {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(missingRepeated(arr)));

    }

    static int [] missingRepeated(int[] arr) {
        //First use cyclic sort to get the array sorted.
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(i<arr.length && arr[correct]!=arr[i])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));
        //Find the repeated number and missing number:
        // missing number= index+1 ie. where index is not equal to the correct after arr is sorted.
        //Duplicate number is the value at arr[index] where index is not equal to the correct after arr is sorted.

        for (int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                return new int[] {index+1,arr[index]};
            }
        }
        return new int[]{-1,-1};
        //element not found as the inputs are wrong as per question.
    }

    static void swap(int[] arr, int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

 //