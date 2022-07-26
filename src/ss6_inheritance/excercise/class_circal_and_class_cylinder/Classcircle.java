package ss6_inheritance.excercise.class_circal_and_class_cylinder;

public class ClassCircle {
   private double radius ;
    private String color;
    private final double PI = 3.14;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    ClassCircle(){

    }
    ClassCircle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Circle with radius of "+getRadius()+" and color"+getColor();
    }
}

