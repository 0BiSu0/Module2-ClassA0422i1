package ss6_inheritance.excercise.class_circal_and_class_cylinder;

public class ClassCylinder extends ClassCircle {
   private double height;
   private double radius;
   private String color;
    ClassCylinder(){

    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    ClassCylinder(double height){
        this.height=height;
    }
    ClassCylinder(double height, double radius, String color){
        this.height=height;
        this.radius = radius;
        this.color = color;
    }
    public double Volume(){
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "+getHeight()+" and Volume = "+Volume()+",which is a subclass of "
                + super.toString();
    }
}
