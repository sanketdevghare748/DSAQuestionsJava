package Sanket.Recursion;

public class Rec_Pow {
    public static void main(String[] args) {
        double x=0.1;
        int n=-4;
        System.out.println(myPow(x,n));
    }
        public static double myPow(double x, int n) {
            if(n==0)
            {
                return 1;
            }
            if(n>0)
            {
                return x* myPow(x,n-1);
            }
            if(n<0)
            {
                return (1/x* myPow(x,n+1));
            }
            return -1;
        }
    }
