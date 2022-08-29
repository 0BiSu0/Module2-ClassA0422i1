package ss14_margin_handling_and_debugging.exercise;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a){
            throw new TriangleEdgesException("Invalid triangle!!!");
        }else {
            System.out.println("Valid Triangle!!!");
        }
        if (a < 0 || b < 0 || c < 0){
            throw new TriangleEdgesException("Cac canh tam giac phai lon hon 0");
        }
    }
}