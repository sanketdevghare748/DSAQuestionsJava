import java.util.HashMap;
import java.util.HashSet;

public class StringPracticeProblems {
	public static void main (String args [])
	{
		
		// TODO Auto-generated method stub
		//Get the count of each letter and also get the letters which are duplicate and unique letters.
		String str= "aadddddbbccefgghi";
		System.out.println("The repeated letters are: "+ getRepeatedCount(str));
		

	}

	private static HashMap <Character, Integer> getRepeatedCount(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> set=  new HashSet<>();
		HashMap<Character,Integer> map= new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		//add into map
		for(char i:set)
		{
			map.put(i, getCount(str, i));
		}
		return map;
		
		
		
		
	}

	private static int getCount(String str, char i) {
		// TODO Auto-generated method stub
		int count=0;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)==i)
			{
				count++;
			}
		}
		return count;
	}

}
