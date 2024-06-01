package Forms;

public class Main {
    public static void main(String[] arg) {
        Shapes[] shapes={
                new Circle(8.1),
                new Triangle(4.3, 0.5),
                new Square(0.0)
        };

               System.out.println("Total sum of square all spapes: " +
                ShapesImplementation.sumSquareCalculateShapes(shapes));
    }
}





