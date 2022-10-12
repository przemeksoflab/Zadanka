package JavaStart.WprowadzanieDanych.Cwiczenie1;


public class Calculator {
    double sum;

    double calculateInts(double a, double b, String operator) {
        return switch (operator) {
            case "+" -> sum = a + b;
            case "-" -> sum = a - b;
            case "*" -> sum = a * b;
            case "/" -> sum = a / b;
            default -> sum;
        };
    }
}
