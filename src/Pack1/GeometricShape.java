package Pack1;

public  class   GeometricShape {
   private String fillColor;
   private  String colorContour;

   private GeometricShape(String colorFill){
        this.fillColor = colorFill;
    }

    protected GeometricShape(){};
   protected GeometricShape(String fillColor, String colorContour) {
        this.fillColor = fillColor;
        this.colorContour = colorContour;
    }



    private double calculatePerimeter(int sideNumber, double side){
       double perimetrer = 0;
       perimetrer = sideNumber*side;
       return perimetrer;
    }
    // I use the perimetrer and Apothem funtion so I only need to call them and everything is done
    private double calculateArea(int sideNumber, double angle, double side){
       double area = 0;
       area = ((calculatePerimeter(sideNumber,side)*Apothem(angle,side)/2));

       return area;
    }
    //I create the Aphotem funtion to do the calculation and I only need to call it
    private double Apothem(double angle, double side){
       double apothem = 0;
       apothem = side/Math.tan(angle/2);
       return apothem;

    }
}
