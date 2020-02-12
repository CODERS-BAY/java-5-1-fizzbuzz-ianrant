package com.codersbay.benleitl;

public class Main {
    public static void main(String[] args) {

        String buzz = "Buzz!";
        String fizz = "Fizz!";
        String fizzBuzz = "FizzBuzz!";
        String number;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(buzz);
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(fizz);
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(fizzBuzz);
            } else {
                number = String.format("%3d", i);
                System.out.println(number);
            }


        }

    }
}
