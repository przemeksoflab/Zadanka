package JavaStart.WprowadzanieDanych.Cwiczenie2;

import java.util.Random;
import java.util.Scanner;

public class OrzelReszka {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Wybierz jedną z dwóch opcji: ");
        System.out.println("0-0rzeł");
        System.out.println("1-reszka");

        int choice = sc.nextInt();

        int liczba = rd.nextInt(0,2);

        if (choice == liczba) {
            System.out.println("Brawo");
        }
            else
            {
                System.out.println("no nie");
            }
        }
    }

