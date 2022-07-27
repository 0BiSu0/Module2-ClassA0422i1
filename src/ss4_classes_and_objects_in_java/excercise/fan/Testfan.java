package ss4_classes_and_objects_in_java.excercise.fan;

public class Testfan {
    public static void main(String[] args) {
        Classfan f1 = new Classfan();
        f1.setMaxSpeed();
        f1.setRadius(3);
        f1.setColor("yellow");
        f1.setOn(true);

        Classfan f2= new Classfan();
        f2.setMediumSpeed();
        f2.setRadius(4);

        System.out.println("Fan1: "+ f1);
        System.out.println("Fan2 "+ f2);
    }
}
