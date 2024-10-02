import java.util.Arrays;
import java.util.*;

public class Rotated_BS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(arr, target));

	}

	public static int search(int[] nums, int target) {
		
		List<Integer> list = new ArrayList<>();
		for(int i:nums)
		{
			list.add(i);
		}
		
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return list.indexOf(nums[mid]);
			} else if (nums[mid] < target) {
				start = start + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
}