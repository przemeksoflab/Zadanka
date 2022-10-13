package JavaStart.Petle.Cwiczenie1;

import java.util.Scanner;

public class Licznik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Podaj ile liczb chcesz wprowadzić");
        int ilosc = sc.nextInt();
        System.out.println("Podaj liczby");

        for (int i = 0; i<ilosc ; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
