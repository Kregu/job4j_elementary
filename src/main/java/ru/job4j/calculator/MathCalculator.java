package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(sum(first, second), multiply(first, second));
    }

    public static double subtractAndDivide(double first, double second) {
        return sum(subtract(first, second), divide(first, second));
    }

    public static double sumFourOperation(double first, double second) {
        return sum(
                sum(subtract(first, second), divide(first, second)),
                sum(sum(first, second), multiply(first, second))
        );
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}