package t16_Tablice_jednowymiarowe.e2;

public class LiftApp {
    static void main() {
        Lift lift = new Lift();

        Person p1 = new Person(70);
        Person p2 = new Person(80);
        Person p3 = new Person(90);
        Person p4 = new Person(100);
        Person p5 = new Person(110);

        lift.add(p1);
        lift.add(p2);
        lift.start();
        lift.remove(p5);
        lift.add(p3);
        lift.add(p4);
        lift.remove(p1);
        lift.start();
        lift.remove(p3);
        lift.add(p1);
        lift.start();
        lift.add(p3);
        lift.start();
        lift.remove(p1);
        lift.remove(p2);
        lift.remove(p3);
        lift.remove(p4);
    }
}
