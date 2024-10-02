package Strings;

import java.util.HashMap;

public class countStrings {
	public static void main(String[] args) {
        String str= "software testing";
    
        System.out.println(getCount(str));
        }
        
        
    
    
    public static HashMap<Character, Integer> getCount(String str)
    {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
        
        	if(str.charAt(i)!=' ' )
        	{
            int count=1;
            if(map.containsKey(str.charAt(i)))
            {
                ++count;
            }
            
            map.put(str.charAt(i),count);
        	}
        }
        return map;
    }
}
