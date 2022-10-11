package JavaStart.Enkapsulacja;

class DiscountService {
    public double calculateDiscountPrice(Client client) {
        if(client.isPremium())
            return calculatePremiumDiscount(client.getPrice());
        else
            return calculateStandardDiscount(client.getPrice());
    }

    private double calculateStandardDiscount(double price) {
        if(price > 1000)
            return applyDiscount(price, 0.1);
        else
            return price;
    }

    private double calculatePremiumDiscount(double price) {
        if(price > 1000)
            return applyDiscount(price, 0.15);
        else
            return applyDiscount(price, 0.05);
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}