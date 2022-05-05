package com.himanshu;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        fun("abcd");
        fun(123);
    }

    static void fun(int number) {
        System.out.println(number + " is a Number !");
    }

    static void fun(String string) {
        System.out.println(string + " is a String !");
    }
}
