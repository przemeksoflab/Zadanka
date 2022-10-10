package JavaStart.StrukturySterujące;

import java.util.Random;

public class RandomNumber {


    public static void main(String[] args) {
        Random random = new Random();
        Randomizer izer = new Randomizer();

        int rand = random.nextInt(0, 10000);


        izer.isOdd(rand);
        izer.jakaLiczba(rand);

        System.out.println("liczba : " + izer.digits(rand));


    }
}
