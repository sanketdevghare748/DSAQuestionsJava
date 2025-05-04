package Recursion;
//Get the nth fibonanci numbder.
public class Fibnaccii {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));
    }
    static int fib(int n)
    {
        //Base condition
        if(n<2) {
            return n;
        }
        //Body

        //Recursive call.
        return fib(n-1)+ fib(n-2);


     
    }
}
