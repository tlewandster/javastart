package t14_Instrukcje_sterujace.e1;

import java.util.Scanner;

public class PointApplication {
    static void main() {
        Point point1 = new Point();
        System.out.println("Start point: " + point1.getX() + " " + point1.getY() + "");
        System.out.println("Choose direction:");
        System.out.println("1 - UP");
        System.out.println("2 - DOWN");
        System.out.println("3 - LEFT");
        System.out.println("4 - RIGHT");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> PointController.addY(point1, 1);
            case 2 -> PointController.minusY(point1, 1);
            case 3 -> PointController.minusX(point1, 1);
            case 4 -> PointController.addX(point1, 1);
            default -> System.out.println("Invalid choice");
        }

        System.out.println("End point: " + point1.getX() + " " + point1.getY());
    }
}
