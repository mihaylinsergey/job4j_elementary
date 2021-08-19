package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double difAnddiv(double first, double second) {
        return dif(first, second)
                + div(first, second);
    }
    public static double sumAndMultiplyAnddifAnddiv(double first, double second) {
        return sum(first, second) + multiply(first, second) + dif(first, second)
                + div(first, second);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAnddiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAnddifAnddiv(10, 20));
    }
}