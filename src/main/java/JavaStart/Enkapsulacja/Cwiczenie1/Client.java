package JavaStart.Enkapsulacja.Cwiczenie1;

class Client {
    private String firstName;
    private String lastName;
    private boolean premium;
    private double price;

    public Client(String firstName, String lastName, boolean premium, double price) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
        this.price = price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}