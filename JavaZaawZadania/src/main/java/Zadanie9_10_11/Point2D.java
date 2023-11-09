package Zadanie9_10_11;

public class Point2D implements MoveAble{
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x = x + moveDirection.getX();
        y = y + moveDirection.getY();
    }
}
