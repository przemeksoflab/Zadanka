package JavaStart.MetodyIKonstruktory.Cwiczenie4;

public class House {

    double waterInL;
    double oilInL;

    House(double a, double b) {
        waterInL = a;
        oilInL = b;
    }
    void takeShower() {
        System.out.println("Bierzemy prysznic");
        waterInL -= 48;
        System.out.println("Stan wody : " + waterInL);
    }
    void takeBath() {
        System.out.println("bierzemy kąpiel");
        waterInL -= 86;
        System.out.println("Stan wody : " + waterInL);
    }
    void makeDinner() {
        System.out.println("gotujemy obiad");
        waterInL -= 4;
        oilInL -= 0.1;
        System.out.println("Stan wody : " + waterInL);
        System.out.println("Stan ropy : " + oilInL);
    }
    void boilWater() {
        System.out.println("gotujemy wodę");
        waterInL -= 0.5;
        oilInL -= 0.05;
        System.out.println("Stan wody : " + waterInL);
        System.out.println("Stan ropy : " + oilInL);
    }
    void watchTV(int time) {
        System.out.println("oglądamy TV");
        oilInL -= (time * 0.07);
        System.out.println("Stan ropy : " + oilInL);
    }


    public static void main(String[] args) {
        House house = new House(10000,1000);
        house.takeBath();
        house.takeShower();
        house.boilWater();
        house.makeDinner();
        house.watchTV(3);
    }
}
