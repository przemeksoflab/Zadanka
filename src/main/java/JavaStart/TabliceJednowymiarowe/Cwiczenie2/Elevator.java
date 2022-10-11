package JavaStart.TabliceJednowymiarowe.Cwiczenie2;

public class Elevator {
    private int peopleNumber = 0;
    private final int maxweight = 400;
    private Person[] peopleInside = new Person[4];

    void add(Person person) {
        if(peopleNumber<4) {
            peopleInside[peopleNumber] = person;
            peopleNumber++;
        }
        else System.out.println("w winidzie ne ma miejsca");
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        if(peopleInside[0]!= null) {
            totalWeight += peopleInside[0].getWeight();
        }
        if(peopleInside[1]!= null) {
            totalWeight += peopleInside[1].getWeight();
        }
        if(peopleInside[2]!= null) {
            totalWeight += peopleInside[2].getWeight();
        }
        if(peopleInside[3]!= null) {
            totalWeight += peopleInside[3].getWeight();
        }
        return totalWeight;

    }
    private boolean weightIsOK () {
       return getTotalWeight()  <= maxweight;
    }

    void start() {
        if (weightIsOK()) {
            System.out.println("winda jedzie");
        } else System.out.println("ktoś musi wysiąść");
    }

    void clear() {
        for (int i = 0; i <peopleInside.length ; i++) {
            peopleInside[i] = null;
        }
        peopleNumber = 0;
        System.out.println("winda jest pusta");
        }
    }

