package t30_Typy_abstrakcyjne.e1;

public class EquilateralTriangle implements Shape {
    double side;
    double height;

    public EquilateralTriangle(double side) {
        this.side = side;
        this.height = side * Math.sqrt(3) / 2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return side * height / 2;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }
}
