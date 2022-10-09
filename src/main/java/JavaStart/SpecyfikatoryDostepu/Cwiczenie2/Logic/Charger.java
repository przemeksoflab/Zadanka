package JavaStart.SpecyfikatoryDostepu.Cwiczenie2.Logic;

import JavaStart.SpecyfikatoryDostepu.Cwiczenie2.Model.Telephone;

public class Charger {
    public void charge(Telephone telephone) {
         telephone.setChargeLevel(telephone.getChargeLevel()+1);
    }
}
