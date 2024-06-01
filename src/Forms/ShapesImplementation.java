package Forms;

public class ShapesImplementation {

    public static double sumSquareCalculateShapes(Shapes[] shapes) {
        double sumSquare = 0;
        boolean error = false;

        for (Shapes shape : shapes) {
            double square = shape.squareCalculateShapes();

            if (square <= 0) {
                error = true;
                break;
            }
            // } else {
            sumSquare += square;
        }


        if (error) {
            System.out.println("\n" +
                    "One or more of the shapes have incorrect values");
        }
            //  return 0;
            //   } else {
            return sumSquare;
        }
    }
