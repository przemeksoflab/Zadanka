package JavaStart.PrzeciazenieMetodISlowoThis.Cwiczenie2;

import java.util.Random;

public class Dice {
    Random random = new Random();

    int liczbaOczek;
    Dice() {

        liczbaOczek = random.nextInt(1,7);
    }
    Dice(int liczbaOczek) {
        this.liczbaOczek = liczbaOczek;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.liczbaOczek);
        Dice dice2 = new Dice(5);
        System.out.println(dice2.liczbaOczek);
    }
}
