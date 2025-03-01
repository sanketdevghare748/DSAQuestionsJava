import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,3,0,2,5,3,4,0,2,0,7,0};
		sort(nums);
		System.out.println(Arrays.toString(nums));

	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int left = 0; // Pointer to place the next zero

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                // Swap zero to the left position
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; // Move left pointer forward
            }
        }
    }
	}

