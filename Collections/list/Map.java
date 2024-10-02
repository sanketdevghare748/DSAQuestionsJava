package Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Map {
public static void main(String[] args) {
	
	int arr[]= {1,3,4,0,5,9,8,-1,3,1};
	int target=4;
	System.out.println(Arrays.deepToString(getPairs(arr,target).toArray()));
	
}

private static List<int []>getPairs(int[] arr, int target) {
	// TODO Auto-generated method stub
	HashMap <Integer,Boolean> map= new HashMap<>();
	List <int []> list= new ArrayList<>();
	
	for(int i:arr)
	{
		int comp= target-i;
		if(map.containsKey(comp))
		{
			list.add(new int [] {i,comp});
		}
		map.put(i,true);
	}

	return list;
	
	//Some functions related to maps.

}

}
