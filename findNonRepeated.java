import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class findNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,1,3,2,4,5,5,2};
		//System.out.println(getNonRepeating(arr));
		System.out.println(getNotRepeated(arr));
		}

	

	private static List<Integer>getNonRepeating(int[] arr) {
		// TODO Auto-generated method stub
		HashSet< Integer> set= new HashSet<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int j:arr)
		{
			map.put(j,1);
		}
			
		for(int i=0;i<arr.length;i++)
			{
				int count=0;
				if(map.containsKey(arr[i]))
				{
					map.put(map.get(arr[i]),++count );
				}
			}
	
		System.out.println(map);
		
		

		
		return null;
	}
	
	//Find the number which are not repeated in the array.
	private static List<Integer> getNotRepeated(int[] arr) {
		// TODO Auto-generated method stub
		
		if(arr.length==0)
		{
			return null;
		}
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int a: arr)
		{
			if(map.containsKey(a))
			{
				map.put(a,map.getOrDefault(a,0)+1);
			}
			else
				map.put(a,1);
		}
		
		List <Integer> op= new ArrayList<>();
		for(Entry e:map.entrySet())
		{
			
			int count= (int) e.getValue();
			if(count==1)
			{
				op.add((int)e.getKey());
			}
		}
		
		return op;
	}
	}


