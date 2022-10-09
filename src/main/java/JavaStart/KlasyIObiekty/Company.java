package JavaStart.KlasyIObiekty;

public class Company {
    public static void main(String[] args) {
        Employee zenek = new Employee();
        Employee lucek = new Employee();
        Employee bartek = new Employee();

        zenek.imie = "Zenon";
        lucek.imie = "Lucjan";
        bartek.imie = "Bartosz";

        zenek.nazwisko = "Kowalski";
        lucek.nazwisko = "Sielawa";
        bartek.nazwisko = "Jakis";

        zenek.rokUrodz = 1967;
        lucek.rokUrodz = 1978;
        bartek.rokUrodz = 1998;

        zenek.stazPracy = 2;
        lucek.stazPracy = 5;
        bartek.stazPracy = 10;

        System.out.println("dane Zenka : " + zenek.imie + " " + zenek.nazwisko + " " + zenek.rokUrodz + " " + zenek.stazPracy);
        System.out.println("dane Lucka : " + lucek.imie + " " + lucek.nazwisko + " " + lucek.rokUrodz + " " + lucek.stazPracy);
        System.out.println("dane Bartka : " + bartek.imie + " " + bartek.nazwisko + " " + bartek.rokUrodz + " " + bartek.stazPracy);
    }
}
