package JavaStart.Poliformizm.Cwiczenie2;

public class Mob {
    private String name;
    private int energy;
    private double attack;
    private double defense;

    public Mob(String name, int energy, double attack, double defense) {
        this.name = name;
        this.energy = energy;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    double allAtk() {
        return attack;
    }

    double allDef() {
        return defense;
    }
}
