package JavaStart.Poliformizm.Cwiczenie1;

public class Nurse extends Person{
    private int overtime;
    public Nurse(String name, int salary, int overtime) {
        super(name, salary);
        this.overtime = overtime;
    }
}
