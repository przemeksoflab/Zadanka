package JavaStart.MetodyEqualsIToString.Cwiczenie1;

public class NoteBookShop {
    public static void main(String[] args) {

        DataStore ds = new DataStore();

        Computer comp1 = new Computer("Toshiba", 1234);
        Computer comp2 = new Computer("Toshiba", 1234);
        Computer comp3 = new Computer("Acer", 1235);
        Computer comp4 = new Computer("Asus", 1236);
        Computer comp5 = new Computer("Lolek", 1274);

        ds.addComp(comp1);
        ds.addComp(comp2);
        ds.addComp(comp3);
        ds.addComp(comp4);
        ds.addComp(comp5);

        ds.printInfo();

        System.out.println(ds.checkAvailability(comp1));
    }
}
