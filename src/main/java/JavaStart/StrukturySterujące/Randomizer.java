package JavaStart.StrukturySterujące;

public class Randomizer {

    void jakaLiczba(int rand) {
        System.out.println(rand);

        if (rand < 5000) {
            System.out.println("Liczba jest mniejsza od 5000");
        }
        else if(rand ==5000) {
            System.out.println("liczba jest rowna 5000");
        }
        else if(rand > 5000) {
            System.out.println("liczba jest wieksza niż 5000");
        }
    }


    void isOdd(int rand) {
        if (rand % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else System.out.println("liczba jest nieparzysta");
    }
    int digits(int rand) {
        if (rand == 0)
            return 0;
        else if (rand / 1000 != 0)
            return rand;
        else if (rand / 100 != 0)
            return rand * 10;
        else if (rand / 10 != 0)
            return rand * 100;
        else
            return rand * 1000;

    }


    }

