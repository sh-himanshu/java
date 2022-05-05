package com.himanshu;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = sc.nextInt();
        System.out.println(n + " term of Fibonacci series is: " + genFibonacci(n));
    }

    static int genFibonacci(int number) {
        if (number == 0 || number == 1) return number;
        return genFibonacci((number - 1)) + genFibonacci((number - 2));
    }
}
