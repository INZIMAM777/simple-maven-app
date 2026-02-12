package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = add(num1, num2);

        System.out.println("=================================");
        System.out.println("Simple Maven Application");
        System.out.println("=================================");
        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum           : " + result);
    }
}
