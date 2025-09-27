package ISP.WithISP;

public class Cuboid implements ThreeDimensionalShape{

    private double length;
    private double breadth;  // fixed spelling
    private double height;

    public Cuboid(double l, double b, double h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    @Override
    public double area() {
        return 2 * (this.height * this.length + this.length * this.breadth + this.breadth * this.height);
    }

    @Override
    public double volume() {
        return this.length * this.breadth * this.height;
    }
}
