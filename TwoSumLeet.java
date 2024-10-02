
import java.util.*;
// there  is a update dfor
public class TwoSumLeet {
//    public static void main(String[] args) {
//        int[] arr1 = new int[]{3,16,4,3,4,11,9,12,8};
//        int target=20;
//
//        twoSum(arr1,target);
//    }
//        public static void twoSum(int[] nums, int target) {
//
//        ArrayList <Integer> list = new ArrayList();
//
//            for(int i=0;i<nums.length;i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        System.out.println(list);
//                    }
//
//                    list.clear();
//
//                }
//            }
//        }
	
	public static void main(String[] args) {
	       int[] arr1 = new int[]{3,16,4,3,4,11,9,12,8};
	        int target=20;

	        System.out.print(Arrays.deepToString(twoSum(arr1,target).toArray()));
	    }

	   public static List<int[]> twoSum(int arr[],int target)
	    {
	        List<int[]> list= new ArrayList <>();
	        HashMap <Integer,Boolean> map= new HashMap<>();
	        
	        for(int i:arr)
	            {
	                int comp=target-i;
	                if(map.containsKey(comp))
	                {
	                    list.add( new int[] {comp,i});
	                }
	                map.put(i,true);
	                
	                
	                
	            }
	        return list;
	        
	    }
    }

