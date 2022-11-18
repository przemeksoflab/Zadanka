package JavaStart.Poliformizm.Cwiczenie1;

public class HospitalApp {
    public static void main(String[] args) {


        Hospital hp = new Hospital();
        Person nurse1 = new Nurse("kasia", 5000, 20);
        Person doctor1 = new Doctor("andrzej", 15000, 2000);
        Person nurse2 = new Nurse("ania", 4000, 40);

        hp.add(nurse1);
        hp.add(nurse2);
        hp.add(doctor1);
    }
}