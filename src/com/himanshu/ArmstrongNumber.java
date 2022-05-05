package com.himanshu;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check if it's an Armstrong Number: ");
        int num = sc.nextInt();
        System.out.println(num + " is" + (isArmstrong(num) ? "" : " not") + " a Armstrong Number");
    }

    static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + (rem * rem * rem);
        }

        return sum == original;
    }
}
