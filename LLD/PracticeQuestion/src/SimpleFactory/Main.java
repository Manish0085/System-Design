package SimpleFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape type ");
        String type = sc.next();

        Shape shape = ShapeFactory.getShape(type);

        if (shape != null){
            shape.draw();
        }


    }
}
