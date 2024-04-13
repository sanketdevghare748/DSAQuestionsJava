package Sanket.Collections.LinkedList;
//Leetcode question: https://leetcode.com/problems/happy-number/description/

public class HappyNumber {
    //To check if a number is happy number or not.
    public static void main(String[] args) {
        int n=2;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=findSumSquareDigits(slow);
            fast=findSumSquareDigits(findSumSquareDigits(fast));

        }while(slow!=fast);
        if(slow==1)
        {
            return true;
        }
        return false;
    }

    private static int findSumSquareDigits(int number) {
        int ans=0;
        while(number>0)
        {
            int rem=number%10;
            ans=rem*rem+ans;
            number=number/10;
        }
        return ans ;
    }
}
