package JavaStart.WprowadzanieDanych.Cwiczenie1;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        double int1 = sc.nextDouble();
        System.out.println("Wprowadź operator");
        String mark = sc.next();
        System.out.println("Wprowadź drugą liczbę");
        double int2 = sc.nextDouble();

        System.out.println(calc.calculateInts(int1, int2, mark));

    }
}
