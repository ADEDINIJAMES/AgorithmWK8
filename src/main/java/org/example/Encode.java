package org.example;

public class Encode {
//    Write a function that performs Run-Length Encoding on a given string.
//    In Run-Length Encoding, consecutive characters are replaced by a
//    single character followed by the count of that character. If the
//    count is 1, it is omitted. For example, the string "AAABBBCCDAA"
//    would be encoded as "3A3B2C1D2A".
    public static String encode(String s){
        StringBuilder builder = new StringBuilder();
        int count=1;
        for (int i =1; i<s.length(); i++){
            if (s.charAt(i)==s.charAt(i-1)){
                count++;
            }else {

                builder.append(count).append(s.charAt(i - 1));
                count = 1;
            }
            }

        builder.append(count).append(s.charAt(s.length()-1));
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("AAABBBCCDAA"));
    }

}
