package ss6_inheritance.excercise.class_point_and_class_moveablepoint;

public class ClassMoveablePoint extends ClassPoint {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public ClassMoveablePoint() {
    }

    public ClassMoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public ClassMoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }

    public ClassMoveablePoint move() {
        super.setX(super.getX()+ xSpeed);
        super.setY(super.getY()+ ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "LopMoveablePoint {" +
                " x = " + getX() +
                ", y = " + getY() +
                ", xSpeed = " + getxSpeed() +
                ", ySpeed = " + getySpeed() +
                '}';
    }
}
