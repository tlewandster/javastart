package t13_Specyfikatory_dostepu.e1;

public class PointController {
    static void addX(Point point, int value) {
        point.setX(point.getX() + value);
    }
    static void addY(Point point, int value) {
        point.setY(point.getY() + value);
    }
    static void minusX(Point point, int value) {
        point.setX(point.getX() - value);
    }
    static void minusY(Point point, int value) {
        point.setY(point.getY() - value);
    }
}
