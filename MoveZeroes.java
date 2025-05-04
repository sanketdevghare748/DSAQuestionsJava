import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,3,0,2,5,3,4,0,2,0,7,0};
		sort(nums);
		System.out.println(Arrays.toString(nums));

	}

	private static void sort(int[] arr) {
		int lastzeroPos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]==0))
			{
				int temp= arr[lastzeroPos];
				arr[lastzeroPos] = arr[i];
				arr[i]=temp;
				lastzeroPos++;
			}
		}


    }

	private static void swap(int[] arr, int i, int zeroPos) {
		// TODO Auto-generated method stub
		int temp=arr[zeroPos];
		arr[zeroPos]=arr[i];
		arr[i]=arr[zeroPos];
		System.out.println(Arrays.toString(arr));
	}
	}

