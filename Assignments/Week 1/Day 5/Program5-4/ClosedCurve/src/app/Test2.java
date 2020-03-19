package app;

public class Test2 {
    public static void main(String[] args){
        Polygon[] polygons  = new Polygon[]{new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4)};

        for(Polygon polygon: polygons){
                System.out.printf("For this %s\n", polygon.getShape());
                System.out.printf(" Number of sides: %d\n", polygon.getNumberOfSides());
                System.out.printf(" Perimeter: %.1f\n", polygon.computePerimeter());
        }
    }
}