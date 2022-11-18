package JavaStart.Poliformizm.Cwiczenie2;

public class Team {
    private String name;
    private Mob[] mobs = new Mob[3];

    public Team(String name, Mob mob1, Mob mob2, Mob mob3) {
        this.name = name;
        this.mobs[0] = mob1;
        this.mobs[1] = mob2;
        this.mobs[2] = mob3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mob[] getMobs() {
        return mobs;
    }

    public void setMobs(Mob[] mobs) {
        this.mobs = mobs;
    }

    public double atkPower(){
        double atkPower = 0;
        for(Mob mob : mobs) {
            atkPower += mob.allAtk();
        }
        return atkPower;
    }
    public double defPower(){
        double defPower = 0;
        for(Mob mob : mobs) {
            defPower += mob.allAtk();
        }
        return defPower;
    }
    public int energy(){
        int energy = 0;
        for(Mob mob : mobs) {
            energy += mob.getEnergy();
        }
        return energy;
    }
}
