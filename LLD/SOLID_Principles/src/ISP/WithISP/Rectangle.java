package ISP.WithISP;

public class Rectangle implements TwoDimensionalShape{


    private double length;
    private double breadth;

    public Rectangle(double l, double b){
        this.breadth = b;
        this.length = l;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
