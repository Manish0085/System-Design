package ISP.WithoutISP;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 6.3);
        Shape square = new Square(4.0);
        Shape cube = new Cube(2.2);
        Shape cuboid = new Cuboid(1.2, 5, 1);




        System.out.println("Square Area: "    + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Cube Area: "      + cube.area());
        System.out.println("Cube Volume: "    + cube.volume());
        System.out.println("Cuboid Area: "    + cuboid.area());
        System.out.println("Cuboid Volume: "    + cuboid.volume());
    }
}
