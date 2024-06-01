package Forms;

public class Square implements Shapes {
    private double side;


    public Square (double side) {
        this.side=side;
          }

    @Override

    public double squareCalculateShapes() {
        if (side <= 0) {
           // System.out.println(" Number must be positive");
            return 0;
        }
        return Math.pow(side,2);
    }
}

