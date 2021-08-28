package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double remaining = amount;
        while (remaining > 0) {
            remaining = amount + amount * percent / 100 - salary;
            year++;
            }
        return year;
    }
}