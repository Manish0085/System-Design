package ISP.WithoutISP;

public class Rectangle implements Shape {

    private double length;
    private double breath;

    public Rectangle(double l, double b){
        this.length = l;
        this.breath = b;
    }


    @Override
    public double area() {
        return this.length * this.breath;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Rectangle doesn't have volume");
    }
}
