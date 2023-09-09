package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringOperations {


    public static void main(String[] args) throws Exception {
        //printLetterByLetterWithForEach("sde basics");
        String[] input = {"ABCD", "EFGH", "IJKL", "MNOP"};
        printStringArrayUsingForEach(input);
//        System.out.println("--------------------");
//        printLetterByLetterWithCharArray("Array Basics");
    }


    static void printLetterByLetterWithCharAt(String input) throws Exception {
        stringNullCheck(input);
        int size = input.length();
        for(int index = 0; index < size; index++){
            System.out.println(input.charAt(index));
        }
    }

    static void printLetterByLetterWithCharArray(String input) throws Exception {
        stringNullCheck(input);
       char[] charArray = input.toCharArray();
       for(int index = 0; index < charArray.length; index++){
           System.out.println(charArray[index]);
       }
    }

    static void printLetterByLetterWithForEach(String input) throws Exception {
        stringNullCheck(input);
        char[] charArray = input.toCharArray();
        for(char c : charArray) {
            System.out.println(c);
        }
    }

    static void stringNullCheck(String input) throws Exception {
        if (StringUtils.isNotEmpty(input)) {
            System.out.println("String is not empty - " +input);
        } else {
            throw new Exception("input shd not be empty");
        }
    }

    static String reverse(String input) throws Exception {
        stringNullCheck(input);
        return null;
    }


    static void printStringArray(String[] input){
        for(int index=0; index < input.length; index++){
            System.out.println(input[index]);
        }
    }

    static void printStringArrayUsingForEach(String[] input){
        for(String s : input){
            System.out.println(s);
        }
    }
}
