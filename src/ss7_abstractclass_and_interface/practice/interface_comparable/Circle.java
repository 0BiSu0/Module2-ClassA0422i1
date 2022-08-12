package ss7_abstractclass_and_interface.practice.interface_comparable;

public class Circle {
    private double radius = 1;
    private String color = "red";
    private final double PI = 3.1415d;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

}
