package ss4_classes_and_objects_in_java.excercise.quadratic_equation;

import java.util.Scanner;

public class TestClassQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        ClassQuadraticEquation pt1 = new ClassQuadraticEquation(a,b,c);
        if (pt1.getDiscriminant()==0){
            System.out.print("Phuong trinh co 1 nghiem: \n"+pt1.getRoot1());
        }else if (pt1.getDiscriminant()>=0){
            System.out.print("Phuong trinh co 2 nghiem: \n"+pt1.getRoot1()+"\n"+pt1.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
