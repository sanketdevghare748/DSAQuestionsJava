package Strings;
import java.util.*;

public class Sort_Trains_By_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []  arr ={"PUNE NGP SF SPL - 01202", "AZAD HIND SPL EXP - 12129", "PUNE DNR EXP - 12149", "KOP NZM SF - 12147", "GOA EXP - 12779", "JHELUM EXP - 11077", "PUNE LUCKNOW SPL - 11407", "PUNE GKP SPL - 01415"};
		//Task sort the train list on basis of number and return list.
		
		System.out.println(getSortedTrains(arr));
	}

	private static TreeMap<Integer,String> getSortedTrains(String[] arr) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String> op= new TreeMap<>();
		
		for(String str:arr)
		{
			String train_number=str.substring(str.length()-6, str.length()).trim();
			op.put(Integer.parseInt(train_number), str);
			
		}
		
		return op;
	}

}
