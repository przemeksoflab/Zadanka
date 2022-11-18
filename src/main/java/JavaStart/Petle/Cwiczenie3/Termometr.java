package JavaStart.Petle.Cwiczenie3;

import java.util.Scanner;

public class Termometr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempAkt;
        double tempOczek;


        System.out.println("podaj temperaturę aktualną");
        tempAkt = sc.nextDouble();
        System.out.println("podaj temperaturę oczekiwaną");
        tempOczek = sc.nextDouble();


        while (tempAkt < tempOczek) {
            tempAkt += 0.5;
            System.out.println("aktualna temperatura" + tempAkt);
            if (tempAkt == tempOczek) {
                System.out.println("Osiągnięto temp oczekiwaną: " + tempOczek);
            }
        }
        while (tempAkt > tempOczek) {
            tempAkt -= 0.5;
            System.out.println("aktualna temperatura" + tempAkt);
            if (tempAkt == tempOczek) {
                System.out.println("Osiągnięto temp oczekiwaną: " + tempOczek);
            }
        }
    }
}
