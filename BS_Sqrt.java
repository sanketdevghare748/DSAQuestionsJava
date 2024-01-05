package Sanket;

//Find the sqrt for the n, with some precision p.
public class BS_Sqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%3f",findsqrt(n, p));
    }

    private static double findsqrt(int n, int p) {
        //Approach= use binary search , to get the whole root.
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n)
                return mid;

            if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        double root = 0.0;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root < n) {
                root = root + incr;
            }
            root = root - incr;
            incr = incr / 10;

        }
        return root;

    }
}
