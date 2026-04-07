package t23_Dziedziczenie.e1;

public class Test {
    public static void main(String[] args) {
        Tire tire = new Tire(123, "SuperTire", "ProContact", 1256, 17, 225);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart(987, "Noisy Parts", "Turbo Brum", 8245, true);
        exhaustPart.printInfo();

    }


}
