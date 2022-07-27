package ss6_inheritance.excercise.class_point2d_and_class_point3d;
public class ClassPoint2d {
    public float x,y;

    public ClassPoint2d() {
    }

    public ClassPoint2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x =  x;
        this.y = y ;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        return  arr= new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "Loppoint2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
