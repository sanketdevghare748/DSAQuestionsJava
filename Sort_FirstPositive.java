
import java.util.Arrays;

public class Sort_FirstPositive {
    public static void main(String[] args) {
        int [] arr= {3,1,5,2,-3,-2};
        System.out.println(firstPositive(arr));

    }

    static int firstPositive(int[] nums) {
        //First use cyclic sort to get the array sorted.
        int i=0;
        while(i<nums.length)

        {
            int correct=nums[i]-1;
            if((nums[i] <=nums.length && nums[i]>0) && nums[correct]!=nums[i])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        //Find the missing number.
        for (int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1)
            {

                return index+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] arr, int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
