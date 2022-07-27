package ss4_classes_and_objects_in_java.excercise.quadratic_equation;

public class Classquadraticequation {
    double a,b,c;
    public Classquadraticequation() {
    }
    public Classquadraticequation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta = b*2 - 4*a*c;
        return delta;
    }
    public double getRoot1(){
        double r1 = (-b+Math.pow(getDiscriminant(),0.5))/2*a;
        return r1;
    }
    public double getRoot2(){
        double r2 = (-b-Math.pow(getDiscriminant(),0.5))/2*a;
        return r2;
    }
}
