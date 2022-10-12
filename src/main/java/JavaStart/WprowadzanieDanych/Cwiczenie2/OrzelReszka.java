package JavaStart.WprowadzanieDanych.Cwiczenie2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OrzelReszka {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wybierz jedną z dwóch opcji: ");
        System.out.println("0-0rzeł");
        System.out.println("1-reszka");

        int choice = sc.nextInt();

        int liczba = ThreadLocalRandom.current().nextInt(0, 1 + 1);

        if (choice == liczba) {
            System.out.println("Brawo");
        }
            else
            {
                System.out.println("no nie");
            }
        }
    }

