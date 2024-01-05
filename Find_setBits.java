package Sanket;
//Q: find the number of set bits in the binary od the number.
public class Find_setBits {
    public static void main(String[] args) {
        int n=123;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(getSetbits(n));
    }

    private static int getSetbits(int n) {
        int i=0;
        while(n>0)
        {
            n=n&(n-1);
            i++;
        }
        return i;
    }
}
