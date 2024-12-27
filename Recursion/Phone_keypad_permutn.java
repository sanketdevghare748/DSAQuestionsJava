package Recursion;

import java.util.ArrayList;

public class Phone_keypad_permutn {
    public static void main(String[] args) {
        //  pad("","12");
        ArrayList<String> ans = padList("", "73");
        System.out.println(ans);
        System.out.println(ans.get(2));
    }

    private static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //Convert given string to integer. '1' to 1.

        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    //To return the arraylist
    private static ArrayList<String> padList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            System.out.println(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //Conver given string to integer. '1' to 1.
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padList(p + ch, up.substring(1)));
        }
        return ans;
    }
}
