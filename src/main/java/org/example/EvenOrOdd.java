package org.example;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        if((number%2)==0){
            return "Even";
        }
        return "Odd"; // Place code here;
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(34));
        System.out.println(evenOrOdd(3));
        System.out.println(evenOrOdd(0));
        System.out.println(evenOrOdd(1));

    }
}
