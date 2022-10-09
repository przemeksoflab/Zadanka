package JavaStart.AgragacjaIKompozycja;

class Person {
    String firstName;
    String lastName;
    String pesel;
}

class BankAccount {
    Person owner;
    double balance;
}

class Credit {
    Person borrower;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;
}
class AdresZameld {
    Person ownerr;
    String ulica;
    int numerDomu;
    int numerMieszkania;
    String miejscowosc;
    int kodPocztowy;

}

class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        AdresZameld adresZameld = new AdresZameld();
        adresZameld.ownerr = person;
        adresZameld.ulica = "tloczka";
        adresZameld.numerDomu = 7;
        adresZameld.numerMieszkania = 77;
        adresZameld.miejscowosc = "koszalin";
        adresZameld.kodPocztowy = 76666;

        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
        System.out.println("mieszka w : "+ adresZameld.miejscowosc);
    }
}
