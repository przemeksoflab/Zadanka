package JavaStart.MetodyEqualsIToString.Cwiczenie1;

import java.util.Objects;

public class Computer {
    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return model == computer.model && Objects.equals(producer, computer.producer);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);

    }
}
