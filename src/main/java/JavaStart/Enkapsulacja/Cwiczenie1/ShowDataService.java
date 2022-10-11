package JavaStart.Enkapsulacja.Cwiczenie1;

public class ShowDataService {
    void printData(Client client, DiscountService ds) {
        if(client.getLastName() == null) {
            System.out.println("Witaj " + client.getFirstName());
        } else if (client.getFirstName()!= null && client.getLastName()!= null) {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        } else if (client.getFirstName() ==null) {
            System.out.println("Dzień dobry Panie " + client.getLastName());
        }
        else if (client.getFirstName()== null && client.getLastName() == null) {
            System.out.println("witaj nieznajomy");
        }

        System.out.println("Kwota przed rabatem: " + client.getPrice());
        System.out.println("Do zapłaty (po rabacie): " + ds.calculateDiscountPrice(client));


    }
}
