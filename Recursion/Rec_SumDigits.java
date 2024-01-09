package Sanket.Recursion;

public class Rec_SumDigits {
    public static void main(String[] args) {
        int n=00;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n<10) {
            return n;
        }
        else
        {
            return (n%10)+sum(n/10);
        }
    }

}