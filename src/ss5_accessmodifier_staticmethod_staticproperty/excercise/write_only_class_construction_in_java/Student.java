package ss5_accessmodifier_staticmethod_staticproperty.excercise.write_only_class_construction_in_java;

public class Student {
    private String name = "tuong";
    private String classes = "A0222i1";
    public Student(){

    }
    public void setName(String newName){
        this.name = newName;
        System.out.println("your name is "+this.name);
    }
    public void setClasses(String newClass){
        this.classes = newClass;
        System.out.println("your class "+ this.classes);
    }

}
