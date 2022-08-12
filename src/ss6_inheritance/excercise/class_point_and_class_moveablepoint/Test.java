package ss6_inheritance.excercise.class_point_and_class_moveablepoint;

public class Test {
    public static void main(String[] args) {
        ClassPoint p = new ClassPoint(3, 3);
        System.out.println("Point: " + p.toString());

        ClassMoveablePoint mPoint = new ClassMoveablePoint(10, 10, 5, 5);
        System.out.println("Movable Point (before): " + mPoint.toString());
        mPoint.move();
        System.out.println("Movable Point (after): " + mPoint.toString());
    }
}
