package JavaStart.Petle.Cwiczenie2;


public class Hospital {

    private final int maxPatientNumbers = 10;
    Patient[] queue = new Patient[maxPatientNumbers];
    private int numberOfPatients = 0;


    public void addPatient(Patient patient) {
        if (numberOfPatients < maxPatientNumbers) {
            queue[numberOfPatients] = patient;
            numberOfPatients++;
        } else System.out.println("skończyło się miejsce");

    }

    public void printPatients() {
        for (int i = 0; i < numberOfPatients; i++) {

            System.out.println(queue[i].getName() + " " +
                    queue[i].getSurname() + " " +
                    queue[i].getPesel());
        }
    }
}
