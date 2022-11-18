package JavaStart.MetodyEqualsIToString.Cwiczenie1;

public class DataStore {
    private final int MAX_COMP_NUMBER = 100;
    int actualCompNumbers = 0;
    Computer[] computerArray = new Computer[MAX_COMP_NUMBER];


    public void addComp(Computer computer){
        for (int i = 0; i < actualCompNumbers; i++) {
            computerArray[actualCompNumbers] = computer;
            actualCompNumbers++;
        }
    }

    public void printInfo() {
        for (int i =0; i < actualCompNumbers; i++) {
            System.out.println(computerArray[i].toString());
        }
    }
    public int checkAvailability(Computer computer) {
        int numberSameComps = 0;
        if (computer.equals(computer)) {
            numberSameComps++;
        }
    return numberSameComps;
    }
}
