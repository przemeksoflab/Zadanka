package JavaStart.SkładoweStatyczne.Cwiczenie1;

public class University {

    public static void main(String[] args) {


        Student student1 = new Student("Kamil", "Jakis", 2345);
        Student student2 = new Student("Andrzej", "vasdfasd", 1234);
        Student student3 = new Student("Mariola", "asda", 6566);

        System.out.println(Student.counter);
    }

}

