package Sanket.com.Sanket.Leetcode_Q;

import java.util.*;

/**
 Q: Given an array with the duplicate elements and we need to return the array of elements which are repeated from the
 given array.
 */
public class DuplicateElementsArr {
    public static void main(String[] args) {
        int  []nums={0,0,3,3,3,4,4,0,5,7,7,7}; //output should be [1,2,7]
        //This will print (number:frequency)
        System.out.println((getDuplicates(nums)));
        //Get numbers which are repeated;
        System.out.println("Number repeated exactly twice " + getRepeatedTwo(nums));
        System.out.println("Number repeated exactly thrice " + getRepeatedThree(nums));

    }

    private static ArrayList<Integer> getRepeatedTwo(int[] nums) {
        ArrayList<Integer> repeateTwo=new ArrayList<>();
        for(int i=1;i<getDuplicates(nums).size();i+=2)
        {
            if(getDuplicates(nums).get(i)>=2)
            {
                repeateTwo.add(getDuplicates(nums).get(i-1));

            }
        }
        return repeateTwo;
    }
    private static ArrayList<Integer> getRepeatedThree(int[] nums) {
        ArrayList<Integer> repeateThree=new ArrayList<>();
        for(int i=1;i<getDuplicates(nums).size();i+=2)
        {
            if(getDuplicates(nums).get(i)==3)
            {
                repeateThree.add(getDuplicates(nums).get(i-1));
            }
        }
        return repeateThree;
    }

    private static ArrayList<Integer> getDuplicates(int[] nums) {
        //Approach:create set and check how many times the number repeated in given arr.
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int element:nums)
        {
            hash_Set.add(element);
        }
        //Hashset converted to list
        List<Integer> aList = new ArrayList<Integer>();
        aList.addAll(hash_Set);

        Arrays.sort(nums);
        //Array also converted to list
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:nums)
        {
            list.add(n);
        }
//Empty output list
        ArrayList <Integer> output =new ArrayList<>();
        {
            for (int i = 0; i <aList.size(); i++) {
                int count=0;
                for(int j=0;j<list.size();j++)
                {
                    if(aList.get(i)== list.get(j))
                    {
                        count++;
                        //System.out.println(count);
                    }

                }
                output.add(aList.get(i));
                output.add(count);




            }
        }
        return output; //This list contains how (number:frequency of that number in the given array)


    }

}
