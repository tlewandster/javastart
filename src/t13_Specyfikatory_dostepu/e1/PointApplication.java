package t13_Specyfikatory_dostepu.e1;

public class PointApplication {
    static void main() {
        Point point1 = new Point();
        PointController.addX(point1, 100);
        PointController.addY(point1, 200);
        Point point2 = new Point(10, 20);
        PointController.minusX(point2, 5);
        PointController.minusY(point2, 10);

        System.out.println(point1.getX() + " " + point1.getY());
        System.out.println(point2.getX() + " " + point2.getY());
    }
}
