package ISP.WithISP;

public class Cube implements ThreeDimensionalShape{

    private double side;

    public Cube(double side){
        this.side = side;

    }


    @Override
    public double area() {
        return 6 * this.side * this.side;
    }

    @Override
    public double volume() {
        return this.side * this.side * this.side;
    }
}
