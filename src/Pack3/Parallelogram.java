package Pack3;

import Pack1.GeometricShape;

public class Parallelogram extends GeometricShape {
    double side1, side2;
    double angle1, angle2;

    public Parallelogram(double side, double angle, String fillColor, String colorContour) {
        super(fillColor, colorContour);
        this.side1 = side;
        this.angle1 = angle;
    }

    public Parallelogram(double side1, double side2, double angle1, double angle2) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.angle1 = angle1;
        this.angle2 = angle2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }
    public Parallelogram(Parallelogram other){
        this.angle1 = other.angle1;
        this.angle2= other.angle2;
        this.side1 = other.side1;
        this.side2 = other.side2;
    }
}
