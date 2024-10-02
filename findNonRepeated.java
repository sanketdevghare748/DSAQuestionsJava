import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class findNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,1,3,2,4,5,5,2};
		System.out.println(getNonRepeating(arr));
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

	}


