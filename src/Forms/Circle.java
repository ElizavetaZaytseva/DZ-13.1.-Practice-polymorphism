package Forms;

public class Circle  implements Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    public double squareCalculateShapes() {
       if (radius <= 0) {
          // System.out.println(" Number must be positive");
           return 0;
       }
      return Math.pow(radius, 2) * Math.PI;
        }
    }

