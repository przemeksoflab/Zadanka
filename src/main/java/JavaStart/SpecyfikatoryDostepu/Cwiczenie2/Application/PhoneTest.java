package JavaStart.SpecyfikatoryDostepu.Cwiczenie2.Application;

import JavaStart.SpecyfikatoryDostepu.Cwiczenie2.Logic.Charger;
import JavaStart.SpecyfikatoryDostepu.Cwiczenie2.Model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Charger charger = new Charger();
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.infoPhone());
        charger.charge(telephone);
        System.out.println(telephone.infoPhone());
    }
}
