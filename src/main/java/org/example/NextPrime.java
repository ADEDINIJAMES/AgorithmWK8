package org.example;

import java.math.BigInteger;

public class NextPrime {
   // Function to get nextPrimeNumber
   public static long nextPrime(int n)
    {
        BigInteger b = new BigInteger(String.valueOf(n));
        return Long.parseLong(b.nextProbablePrime().toString());
    }

    // Driver method
    public static void main (String[] args)
    {
        int n = 14;
        System.out.println(nextPrime(n));

    }
    static int nextFibonacci(int n)
    {
        double a = n * (1 + Math.sqrt(5)) / 2.0;
        return (int)Math.round(a);

    }

}


