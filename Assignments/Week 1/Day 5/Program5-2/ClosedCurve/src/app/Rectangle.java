package app;

public class Rectangle extends ClosedCurve {
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
    String getShape() {
        return "Rectangle";
    }
}