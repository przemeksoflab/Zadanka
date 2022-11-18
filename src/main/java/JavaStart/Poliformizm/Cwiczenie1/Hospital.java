package JavaStart.Poliformizm.Cwiczenie1;

public class Hospital {
    private static final int MAX_EMPLOYEE = 3;
    private int actualEmplyee;
    public Person[] team;

    public void add(Person person) {
        if(actualEmplyee < MAX_EMPLOYEE) {
            team[actualEmplyee] = person;
            actualEmplyee++;
        }
    }
    String getInfo() {
        String result = "";
        for (int i = 0; i < actualEmplyee; i++) {
//            result = result + team[i].getInfo() + "\n";
        }
        return result;
    }

}
