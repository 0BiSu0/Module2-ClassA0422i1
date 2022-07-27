package ss6_inheritance.excercise.class_circal_and_class_cylinder;

public class Classcylinder extends Classcircle{
    double height;
    Classcylinder (){

    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Classcylinder (double height){
        this.height=height;
    }
    Classcylinder (double height,double radius, String color){
        this.height=height;
        this.radius = radius;
        this.color = color;
    }
    public double Volume(){
        return super.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "+getHeight()+" and Volume = "+Volume()+",which is a subclass of "
                + super.toString();
    }
}
