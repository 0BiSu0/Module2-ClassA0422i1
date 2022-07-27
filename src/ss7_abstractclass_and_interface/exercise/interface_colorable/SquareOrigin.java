package ss7_abstractclass_and_interface.exercise.interface_colorable;

public class SquareOrigin extends Shape{
    private double width = 1;
    private String color = "red";

    public SquareOrigin() {
    }

    public SquareOrigin(double width, String color) {
        this.width = width;
        this.color = color;
    }
    public void howToColor() {
        System.out.printf("Square width %.2f color %s\n", width, color);
    }
}

