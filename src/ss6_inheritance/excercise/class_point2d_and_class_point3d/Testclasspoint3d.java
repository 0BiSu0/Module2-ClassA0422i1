package ss6_inheritance.excercise.class_point2d_and_class_point3d;

public class Testclasspoint3d {
    public static void main(String[] args) {
        Classpoint3d point3d1 = new Classpoint3d(3,4,5);
        for (int i = 0 ; i < point3d1.getXYZ().length;i++){
            System.out.println(point3d1.getXYZ()[i]);
        }
        System.out.println(point3d1);
    }
}
