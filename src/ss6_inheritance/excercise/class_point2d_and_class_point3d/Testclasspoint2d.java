package ss6_inheritance.excercise.class_point2d_and_class_point3d;

public class Testclasspoint2d {
    public static void main(String[] args) {
        Classpoint2d point1 = new Classpoint2d(3,5);
        for (int i = 0 ; i < point1.getXY().length;i++){
            System.out.println(point1.getXY()[i]);
        }
        System.out.println(point1);
    }
}
