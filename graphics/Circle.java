package graphics;
import java.util.Scanner;

public class Circle {
    double r;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}