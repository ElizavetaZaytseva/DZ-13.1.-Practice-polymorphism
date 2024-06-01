package Forms;

public class Triangle implements Shapes {
    private double base;
    private double height;

    public Triangle (double base, double height) {
        this.base = base;
        this.height=height;
    }

    @Override

    public double squareCalculateShapes() {
          if (base <= 0 ||height<=0) {
        //  System.out.println("Number must be positive");
              return 0;
        }
        return Math.pow(base,height)/2;
    }
}
