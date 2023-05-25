package Pack2;

import Pack1.GeometricShape;

public class RegularPolygon extends GeometricShape {
   private int numberSides;
    private double side;
   private double angle;



    public RegularPolygon(int numberSides, double side, double angle, String fillColor, String outlinecolor) {
        super(fillColor, outlinecolor);
        this.numberSides = numberSides;
        this.side = side;
        this.angle = angle;
    }
}
