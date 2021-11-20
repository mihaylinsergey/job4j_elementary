package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int num) {
        return x - num;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + minus(num) + multiply(num) + divide(num);
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(minus(1));
        System.out.println(new Calculator().multiply(1));
        System.out.println(new Calculator().divide(5));
        Calculator testSum = new Calculator();
        System.out.println(testSum.sumAllOperation(1));
    }
}
