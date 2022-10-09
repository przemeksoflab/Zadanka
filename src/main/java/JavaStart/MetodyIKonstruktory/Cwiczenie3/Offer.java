package JavaStart.MetodyIKonstruktory.Cwiczenie3;

class Offer {
    Product product1;
    double price;
    boolean special;
    Offer (Product pro, double pric, boolean spec) {
        product1 = pro;
        price = pric;
        special= spec;

    }
    void print() {
        System.out.println(product1.name);
        System.out.println(product1.producer);
        System.out.println(price);
        System.out.println(special);
        System.out.println();
    }

}