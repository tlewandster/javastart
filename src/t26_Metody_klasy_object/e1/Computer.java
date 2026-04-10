package t26_Metody_klasy_object.e1;

import java.util.Objects;

public class Computer {

    private final String producer;
    private final int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Computer computer)) return false;
        return model == computer.model && Objects.equals(producer, computer.producer);
    }

    @Override
    public String toString() {
        return "Komputer " + producer + "(model " + model + ")";
    }
}
