import java.util.*;
public class MergeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,3,4));
		ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(2,5,6));
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(mergeTwoArrayList(list1,list2));
		
	}

	private static ArrayList <Integer> mergeTwoArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		int length= list1.size()+list2.size();
		list1.addAll(list2);
		
		//Sort list 1
		for(int i=0;i<list1.size();i++)
		{
			for(int j=1;j<list1.size()-i;j++)
			{
				if(list1.get(j-1)>=list1.get(j))
				{
					int temp= list1.get(j);
					list1.set(j, list1.get(j-1));
					list1.set(j-1, temp);
				}
			}
		}
		return list1;
		
	}
	
	
	
	
}
