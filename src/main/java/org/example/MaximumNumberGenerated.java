package org.example;

import java.lang.module.ModuleDescriptor;
import java.util.*;

public class MaximumNumberGenerated {
    public static int check(int num) {
        LinkedList<Integer> number = new LinkedList<>();
        while (num > 0) {
            number.add(num % 10);
            num /= 10;
        }

        Collections.sort(number);
        Collections.reverse(number);
        StringBuilder builder= new StringBuilder();

        for(int i= 0; i< number.size();i++ ){
            builder.append(number.get(i));
        }

return Integer.valueOf(builder.toString());
        //return Integer.parseInt(builder.toString());

    }
    public static void main(String[] args) {
        System.out.println(check(565790));
    }

}
