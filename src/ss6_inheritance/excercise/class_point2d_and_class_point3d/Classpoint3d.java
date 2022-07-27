package ss6_inheritance.excercise.class_point2d_and_class_point3d;

public class ClassPoint3d extends ClassPoint2d {
    public float z ;

    public ClassPoint3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public ClassPoint3d() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        this.x = x;
        this.y = y ;
        this.z = z ;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        return  arr= new float[]{this.x, this.y,this.z};
    }

    @Override
    public String toString() {
        return "LopPoint3d{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';

    }
}
