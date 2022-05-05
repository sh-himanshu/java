package com.himanshu;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number + " is" + (isPrime(number) ? "" : " not") + " a Prime Number.");
    }

    static boolean isPrime(int number) {

        // 1 is neither prime nor composite
        if (number <= 1) return false;

//        not optimized
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) return false;
//        }

        int c = 2;
        while (c * c <= number) {
            if (number % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > number;

    }
}
