package JavaStart.TabliceJednowymiarowe.Cwiczenie2;

public class ElevatorApp {
    public static void main(String[] args) {
        Person pers1 = new Person(1,100);
        Person pers2 = new Person(2,70);
        Person pers3 = new Person(3,14);
        Person pers4 = new Person(4,120);

        Elevator winda = new Elevator();
        winda.add(pers1);
        winda.add(pers2);
        winda.add(pers3);
        winda.add(pers4);

        winda.start();

        winda.clear();
    }
}
