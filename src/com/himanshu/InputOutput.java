package com.himanshu;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = sc.nextInt();
        System.out.println("Your number is: " + number);

    }
}
