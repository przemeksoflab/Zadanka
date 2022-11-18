package JavaStart.Petle.Cwiczenie2;


import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int option = -1;


        //while - wybieramy opcje
        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0-wyjście z programu");
            System.out.println("1-dopisanie pacjenta");
            System.out.println("2-wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję");
            option = sc.nextInt();
            sc.nextLine();


            //switch(opcja)
            // case 1 - new Pacjent i skanery
            switch (option) {
                case addPatient -> {
                    Patient patient = new Patient();
                    System.out.println("imię:");
                    patient.setName(sc.nextLine());
                    System.out.println("nazwisko:");
                    patient.setSurname(sc.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(sc.nextInt());
                    hospital.addPatient(patient);
                }
                case printPatients -> hospital.printPatients();
                case exit -> System.out.println("Dziękujemy!");
                default -> System.out.println("Nie znaleziono takiej opcji");
            }
        }


    }
}
