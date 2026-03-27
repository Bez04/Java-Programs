package graphics;
import java.util.Scanner;

public class Triangle {
    double b, h;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        b = sc.nextDouble();
        System.out.print("Enter height: ");
        h = sc.nextDouble();
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}