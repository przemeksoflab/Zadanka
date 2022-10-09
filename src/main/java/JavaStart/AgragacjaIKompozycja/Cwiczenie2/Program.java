package JavaStart.AgragacjaIKompozycja.Cwiczenie2;

public class Program {
    public static void main(String[] args) {
        Auction1 aukcja1 = new Auction1();
        aukcja1.title = "xboxOne";
        aukcja1.description = "konsola dla wymagających graczy";
        aukcja1.price = 999.99;

        aukcja1.sprzedawca1 = new Seller();
        aukcja1.sprzedawca1.firstName = "Jan";
        aukcja1.sprzedawca1.lastName = "Kowalski";

        aukcja1.sprzedawca1.adress = new Adress();
        aukcja1.sprzedawca1.adress.postalCode = 76880;
        aukcja1.sprzedawca1.adress.city = "Wrocław";
        aukcja1.sprzedawca1.adress.ulica = "Kościuszki";

        System.out.println(aukcja1.title);
        System.out.println(aukcja1.sprzedawca1.firstName);
        System.out.println(aukcja1.sprzedawca1.adress.ulica);
    }


}
