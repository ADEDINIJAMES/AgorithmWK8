package org.example;

import java.util.List;
    public class Challenge {
        public static int lookSay(int number) {
     int count=1;
      List<Integer> list= List.of(number);
      String s = String.valueOf(number);
     StringBuilder builder = new StringBuilder();

     for (int i=1; i<s.length();i++){
        if (s.charAt(i)== s.charAt(i-1)){
         count++;
        }else{
         builder.append(count).append(s.charAt(i-1));
       count=1;
     }


     }
            builder.append(count).append(s.charAt(s.length()-1));

        return Integer.parseInt(builder.toString());
        }


    public static void main(String[] args) {
        System.out.println(lookSay(1));
    }
}
