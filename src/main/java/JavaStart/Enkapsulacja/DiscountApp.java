package JavaStart.Enkapsulacja;

class DiscountApp {
    public static void main(String[] args) {
        ShowDataService lala = new ShowDataService();
        Client client1 = new Client("Jan", "Kowalski", true, 1100);
        Client client2 = new Client("Karol", "Nowak", false, 1100);
        Client client3 = new Client("Przem", "Lolek", false, 2100);
        Client client4 = new Client(null, "jakis", false, 3100);
        Client client5 = new Client("Kamil", null, true, 3100);


        DiscountService discountService = new DiscountService();


        lala.printData(client1,discountService);
        lala.printData(client3,discountService);
        lala.printData(client4,discountService);
        lala.printData(client5,discountService);

    }
}