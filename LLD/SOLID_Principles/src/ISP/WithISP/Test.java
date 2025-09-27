package ISP.WithISP;

public class Test {

    public static void main(String[] args) {

        TwoDimensionalShape square = new Square(2.3);
        TwoDimensionalShape rectangle = new Rectangle(2.3, 4.0);
        ThreeDimensionalShape cube = new Cube(4.4);
        ThreeDimensionalShape cuboid = new Cuboid(1.0, 1.0, 1.0);


        System.out.println("Square Area: "    + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Cube Area: "      + cube.area());
        System.out.println("Cube Volume: "    + cube.volume());
        System.out.println("Cuboid Area: "    + cuboid.area());
        System.out.println("Cuboid Volume: "    + cuboid.volume());
    }
}
