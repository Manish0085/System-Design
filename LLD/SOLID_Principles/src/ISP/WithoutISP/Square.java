package ISP.WithoutISP;

public class Square implements Shape {

    private double side;

    public Square(double side){
        this.side = side;
    }


    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Rectangle doesn't have volume");
    }
}
