import java.util.*;

public class findTwoMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,3,5,7,9,11};
		//output should be [2,4]
		//sorted array [1,3,5,6,7]
		
		System.out.println(getDuplicates(arr));
	}

	private static List<Integer> getDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int sub=0;
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			int correct=arr[i]-1;
			if(correct==i+sub)
			{
				continue;
			}
			else {
				list.add(correct);
				sub++;
			}
		}
		return list;
	}

}
