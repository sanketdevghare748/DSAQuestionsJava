package Sanket;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);

        //Need to intialise as there is no bydefault list like array.
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }

        // Take input via for loop

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

        System.out.println(list.get(0));
        list.clear();

    }
}
