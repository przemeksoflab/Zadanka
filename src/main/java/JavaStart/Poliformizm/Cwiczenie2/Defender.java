package JavaStart.Poliformizm.Cwiczenie2;

public class Defender extends Mob{
    private double defMultiply = 0.2;
    public Defender(String name, int energy, double attack, double defense, double defMultiply) {
        super(name, energy, attack, defense);
        this.defMultiply = defMultiply;
    }

    double allDef() {
        return getDefense() + getDefense() * defMultiply;
    }

    public double getDefMultiply() {
        return defMultiply;
    }

    public void setDefMultiply(double defMultiply) {
        this.defMultiply = defMultiply;
    }
}
