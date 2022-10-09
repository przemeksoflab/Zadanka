package JavaStart.OperacjeNaZmiennych;

public class Cwiczenie2 {
    public static void main(String[] args) {


        double tax = 0.23;
        int nettoPrice= 50;
        double bruttoPrice = nettoPrice + nettoPrice * tax;

        System.out.println(bruttoPrice);
    }
}