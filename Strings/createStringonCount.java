package Strings;

public class createStringonCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "a2b3c4";
		System.out.println(processedString(str));

	}

	private static String processedString(String str) {
		// TODO Auto-generated method stub
		String s="";
		char [] charArr= str.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			//System.out.println(charArr[i]);
			
			if((i%2)==0)
			{
				String temp= ""+charArr[i+1];
				for(int j=0;j<Integer.parseInt(temp);j++)
						{
							
							s=s+charArr[i];
						}
			}
		}
		return s;
	}

}
