package t16_Tablice_jednowymiarowe.e2;

public class Person {
    static int nextId = 0;
    int id;
    int weight;

    public Person(int weight) {
        this.id = ++nextId;
        this.weight = weight;
    }
}
