package org.example;
import java.math.*;
import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DigPow {

        public static long digPow(int n, int p) {
            LinkedList<Integer> result = new LinkedList<>();
            if(n==0){
                return -1;
            }
            int original = n;
            while(n>0){
                result.push(n%10);
                n/=10;
            }
            System.out.println(result);
            int b=0;
            int w = 0;
            for(int i= 0; i<result.size();i++){
                w+= (int) Math.pow(result.get(i), p);
                p+=1;



            }
            System.out.println(w);
            int k = w/original;
            if((w%original)==0){
                return k;
            }
            return -1;
        }



    public static void main(String[] args) {

        System.out.println(digPow(89,1));
        }
    }
