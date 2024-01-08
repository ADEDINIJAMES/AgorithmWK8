package org.example;
import java.math.*;
public class FindNextPerfectSquare {
        public static Boolean checkPsquare(long n){
            long a = (long)Math.sqrt(n);
            long b= a*a;
            boolean z = false;
            if (b == n){ z= true; }
            return z;
        }
        public static long findNextSquare(long num) {
            long number= num;
            long sum=0;

            if(!checkPsquare(num)){
                return -1;
            }
            while(true){
                num+=1;
                if(checkPsquare(num)){
                    sum=num;
                    break;
                }
            }
            return sum;
        }
    }

