package Strings;

import java.util.ArrayList;
import java.util.List;

public class AllSubstrings {
//o find all permutations of a given string.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println(findAllSubstring(str));
	}

private static List<String> findAllSubstring(String str) {
	List<String> list2 = new ArrayList<>();
	// TODO Auto-generated method stub
//use recursion
	list2.addAll(permute("",str));
	return list2;

}

private static List<String> permute(String p, String str) {
	// TODO Auto-generated method stub
	List<String> list = new ArrayList<>();
	if(str.length()==0)
	{
		
		System.out.println(p);
		list.add(p);
		
	}
	else
	{
		for(int i=0;i<str.length();i++)
		{
			String rem=str.substring(0,i)+str.substring(i+1);
			permute(p+str.charAt(i),rem);
		}
	}
	return list;

}
}
