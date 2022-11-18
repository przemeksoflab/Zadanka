package JavaStart.SkładoweStatyczne.Cwiczenie1;

public class Student {
    public String name;
    public String surName;
    public int indexNumber ;
    public static int counter = 0;

    public Student(String name, String surName, int indexNumber) {
        this.name = name;
        this.surName = surName;
        this.indexNumber = indexNumber;
        counter++;
    }

}
