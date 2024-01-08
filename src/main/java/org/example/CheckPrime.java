package org.example;
import java.math.*;
public class CheckPrime {
        public  static boolean checkPrime(int n){
            BigInteger bigInteger = new BigInteger(String.valueOf(n));
          return bigInteger.isProbablePrime(n);

        }
    public  static int checknextPrime(int n){
     BigInteger bigInteger = new BigInteger(String.valueOf(n));
     return Integer.parseInt(bigInteger.nextProbablePrime().toString());

    }
    public static void main(String[] args) {
        System.out.println(checkPrime(13));
        System.out.println(checknextPrime(13));
        System.out.println(fibonnaci(8));
        System.out.println(NextPowerTwo(2));

    }
//    Write a function to find the next number in the Fibonacci sequence
//    after the one passed as a parameter. If the parameter is not part
//    of the Fibonacci sequence, return -1. You may assume the parameter
//    is positive.*/
public static int fibonnaci(int n){
            double a = n *(1+ Math.sqrt(5))/2.0;
            return (int) Math.round(a);
}
public  static  int NextPowerTwo(int n){
            return n+n;
}

}
