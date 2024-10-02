
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int Max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int Min=arr[0][0];


//        for(int i=0; i< arr.length;i++) {
////            for (int j=0; j < arr[i].length; j++) {
////                System.out.print(arr[i][j] + " ");
//            System.out.println(Arrays.toString(arr[i]));
//            }
        //Enhanced for loop
        for (int[] n : arr) {
            System.out.println(Arrays.toString(n));
        }

        //Find the highest element of the Array:

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= Max) {
                    Max = arr[i][j];
                }
                if (arr[i][j] <= Min) {
                    Min = arr[i][j];
                }
            }
        }
        System.out.println("Max: " + Max + " Min: " + Min);


    }
}

