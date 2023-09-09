package org.example;

public class NumberReverse {

    public static void main(String[] args) {


        int number = 1;
        System.out.println("Given number is: " + number);
        int revNumber = 0;

        while(number > 0 ){
            int modulo = number % 10;
            revNumber = ( revNumber * 10 )+ modulo;
            number = number/10;
        }

        System.out.println("Reversal of the given number is : " +revNumber);
    }
}
