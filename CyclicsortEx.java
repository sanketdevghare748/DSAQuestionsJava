import java.util.Arrays;

public class CyclicsortEx {

			public static void main (String[] args) throws java.lang.Exception
			{
				// cyclic sort
				int [] arr= {1,4,2,4,5,};
				sortcyclic(arr);
				System.out.println(Arrays.toString(arr));
			}
			
			public static void sortcyclic(int [] arr)
			{
			    
			   int i=0;
			   while(i<arr.length)
			   {
				   int correct=arr[i]-1;
			   if(i!=correct)
			   {
			       swap(arr,i,correct);
			   }
			   else
			   {
			       i++;
			   }
			   System.out.println(Arrays.toString(arr));
			}
			}
			
			public static void swap(int [] arr, int first,int second)
			{
			    int temp= arr[first];
			    arr[first]=arr[second];
			    arr[second]=temp;
			}

	}
