import java.util.Arrays;

public class RotateArraybyN {
//Approach : first reverse entire array {6,5,4,3,2,1}  now reverse first n elements, {5,6,4,3,2,1} now reverse remaining array {5,6,1,2,3,4}
	public static void main(String[] args) {
		// Rotate an array by n.
		int [] arr= {1,2,3,4,5,6}; //op:{5,6,1,2,3,4}
		int n=12;
		System.out.println(Arrays.toString(rotate(arr,n)));

	}

	private static int[] rotate(int[] arr, int n) {
		// TODO Auto-generated method stub
		int nActual=n%arr.length;
		if(n<0)
		{
			nActual=n+arr.length;
		}
		//First entire array has to be reversed.
		reverse(arr,0,arr.length-1);
		//Reverse first nActual elements
		reverse(arr,0,nActual-1);
		//Reverse remaining element from the array.
		reverse(arr,nActual,arr.length-1);
		return arr;
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
