package app;

public class Rectangle extends ClosedCurve implements Polygon {
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double computeArea() {
        return length * width;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double computePerimeter() {
        return length*2 + width*2;
    }
}