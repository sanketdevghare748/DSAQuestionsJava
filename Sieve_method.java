package Sanket;
//Q:Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
//Sieve of Eratosthenes method.
public class Sieve_method {
    public static void main(String[] args) {
        int n=200;
        boolean [] primes= new boolean [n+1];

        sieve(n,primes);

    }

    private static void sieve(int n, boolean[] primes) {
        //we have to check the numbers until the number is less than the sqrt of the number.
        for (int i=2; i*i<n;i++)
        {
            if(!primes[i]) // primes is already set as false , then !false= true.
            {
              for (int j=i*2; j<=n;j+=i)
              {
                  primes[j]=true; //This will make all those positions of the array to true where the number has already some factor.
              }
            }
        }
        //Now, just print only those numbers where, the index value is false.
        for (int i=2;i<n;i++)
        {
            if(!primes[i]) // checking if primes[i] == false ie. no factor has been found after the complete iteration.
            {
                System.out.print(i+ " ");
            }
        }
    }
}
