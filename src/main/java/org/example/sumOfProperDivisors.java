package org.example;

import java.math.BigInteger;

public class sumOfProperDivisors {
    public static boolean check(int n, int sum){
        if (n%sum==0&sum<n){
            return true;
        }
        return false;
    }
    public static int sumOfProperDiv(int num){
        if (num==1){
            return 1;
        }
        int sum =1;
        int count=1;
        while (true){
            if(check(num,sum)){
                sum+=sum;

            }
            count++;
            if(count==num | sum> num| sum==num){
                break;
            }
        }
        return sum;
    }
    public static  boolean prime(int num){
        BigInteger bigInteger = new BigInteger(String.valueOf(num));
       return bigInteger.isProbablePrime(num);
    }
    public static int sumOfProperDivisors(int n) {

        if(n<=1| prime(n)){return 0;}
        int divisor =1;
        for(int i=2 ; i<= Math.sqrt(n);i++){
            if (n%i==0){
                divisor+=i;
                if(i!=n/i){
                    divisor+=n/i;
                }
            }

        }
        return divisor;
//       if(n<=1){
//           return 0;
//       }
//       int divisor= 1;
//       for (int i= 2 ; i<=Math.sqrt(n); i++){
//           if (n%i==0){
//               divisor+=i;
//               if (i!= n/i){
//                   divisor+=n/i;
//               }
//           }
//       }
//       return divisor;
    }

    public static void main(String[] args) {
       // System.out.println(15);
        System.out.println(sumOfProperDivisors(3));
    }

}
