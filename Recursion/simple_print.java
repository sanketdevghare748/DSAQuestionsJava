package Sanket.Recursion;

public class simple_print {
    //Q: print all the numbsers from n to 1;
    public static void main(String[] args) {
        int n=10;
        func(n);
    }

    private static void func(int n) {
        if(n==10)
        {
            System.out.println(n);
            return;
        }
        else
        {
            System.out.println(n);
            func(n+1);
        }
    }
}
