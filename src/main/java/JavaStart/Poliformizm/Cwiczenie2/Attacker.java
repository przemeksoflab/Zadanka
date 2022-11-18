package JavaStart.Poliformizm.Cwiczenie2;

public class Attacker extends Mob{
    private double atkMultiply = 0.2;

    public Attacker(String name, int energy, double attack, double defense, double atkMultiply) {
        super(name, energy, attack, defense);
        this.atkMultiply = atkMultiply;
    }

    double allAtk() {
        return getAttack() + getAttack() * atkMultiply;
    }

    public double getAtkMultiply() {
        return atkMultiply;
    }

    public void setAtkMultiply(double atkMultiply) {
        this.atkMultiply = atkMultiply;
    }
}
