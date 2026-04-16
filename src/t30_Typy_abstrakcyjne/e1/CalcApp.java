package t30_Typy_abstrakcyjne.e1;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj geometrii:");
        System.out.println("1 - prostokąt");
        System.out.println("2 - trójkąt równoboczny");
        System.out.println("3 - koło");
        int choice = scanner.nextInt();
        Shape shape = null;
        switch (choice) {
            case 1:
                System.out.println("Prostokąt: podaj długość boku a i b");
                shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                break;
            case 2:
                System.out.println("Trójkąt równoboczny: podaj długość boku a");
                shape = new EquilateralTriangle(scanner.nextDouble());
                break;
            case 3:
                System.out.println("Koło: podaj promień");
                shape = new Circle(scanner.nextDouble());
                break;
            default:
                System.out.println("Nieprawidłowy wybór");
                return;
        }

        System.out.println("Pole: " +  shape.area());
        System.out.println("Obwód: " + shape.perimeter());

    }
}
