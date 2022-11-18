package JavaStart.Poliformizm.Cwiczenie1;

public class Doctor extends Person {
    private int bonus;
    public Doctor(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
}
