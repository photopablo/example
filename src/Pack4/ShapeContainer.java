package Pack4;

import Pack1.GeometricShape;
import Pack2.RegularPolygon;
import Pack3.Parallelogram;

public class ShapeContainer {
   GeometricShape[][] geometricShapes;

   private int rows;
   private int columns;

    public ShapeContainer( int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.geometricShapes = new GeometricShape[rows][columns];
    }


    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void addShape(int rows, int columns){

    }

    public void sumAreas(){

    }
    public void sumPerimeters(){

    }
    public void addShape(int rows, int columns, GeometricShape shape){
        geometricShapes[rows][columns] = shape;
    }
}

