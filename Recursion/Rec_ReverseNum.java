package Sanket.Recursion;

public class Rec_ReverseNum {
    public static void main(String[] args) {
        int n=123431;
        System.out.println(rev(n));
        System.out.println(place(n));
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        int temp=n;
        if(temp==(rev(n)))
            return true;
        else
            return false;
    }

    private static int rev(int n) {
        int digitValue= place(n);

        if(n<10)
        {
            return n;
        }
        else
            return (int) ((Math.pow(10,place(n))*(n%10))+rev(n/10));
    }

    private static int place(int n) {
        int Decplace=0;
        while(n>1)
        {
            n=n/10;
            Decplace++;
            //System.out.println(Decplace);
        }
        return Decplace;
    }

}
