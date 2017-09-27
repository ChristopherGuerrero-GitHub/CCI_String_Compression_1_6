package com.example.java;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to CCI book problem 1.6. The input is a string  of letters that are repeated
            consecutively. A compress method consists of accepting a string object for a parameter and use a string
            builder object to collect the unique characters and the number of consecutive repetition of each of the
            same letter. ie. aaabb -> after compress method result is: a3b2
         */
        String str;
        str = "aabbcccccaaa";

        String output = compress(str);
        System.out.println(output);

    }

    /*
        The compress method will accept the string object as a parameter and create a stringbuilder object that
        will be used to contain unique letter and the number of consecutive repetitions of that unique letter.
     */
    static String compress(String str){

        //create Stringbuilder object
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length() ; i++) {
            countConsecutive++;

            if ( (i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
