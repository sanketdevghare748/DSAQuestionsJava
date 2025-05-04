import java.util.HashMap;
import java.util.Map.Entry;

import Collections.list.Map;

public class EvenDigitsNumber {
//    public static void main(String[] args) {
//        int [] arr={1,24,45,345,-234,54665};
//
//        int ans=EvenDigitn(arr);
//        System.out.println(ans);
//        System.out.println(Isevnedigit(1000));
//    }
//    static  int EvenDigitn(int[]arr1){
//
//        int count=0;
//        for( int i=0;i<arr1.length;i++){
//            if(arr1[i]<0){
//                arr1[i]=arr1[i]*(-1); // edge cases added to check if the number is negative in the given array.
//            }
//            if(Isevnedigit(arr1[i])){
//                count++;
//            }
//        }
//        return count;
//    }
//    static  boolean Isevnedigit(int num){
//        int digits=0;
//        for(int i=0;num>0;i++){
//            int unitDigit= num%10;
//            digits++;
//            num=num/10;
//        }
//        if(digits%2==0){
//            return true;
//        }
//        else
//            return false;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=1213240127;
		System.out.println(getoccuranceDigit(num));
		//op: {1:2;2:3;3:1;4:1}

	}
	
	public static HashMap<Integer,Integer> getoccuranceDigit(int num)
	{
	    HashMap<Integer,Integer> map= new HashMap<>();
	    while(num>0)
	    {
	        int rem=num%10;
	        num=num/10;
	        map.put(rem,map.getOrDefault(rem,0)+1);
	    }
	    //Iterating over for keys of map
	    
	    for(int key:map.keySet())
	    {
	    	System.out.println(key);
	    }
	    
	    //Iterating over values
	    for(int value:map.values())
	    {
	    	System.out.println(value);
	    }
	    
	    for(Entry<Integer,Integer> entries: map.entrySet())
	    {
	    	System.out.println(entries.getKey());
	    	System.out.println(entries.getValue());
	    	
	    }
	    return map;
	}
 
}
