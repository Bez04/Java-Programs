package graphics;
import java.util.Scanner;

public class Rectangle {
    double l, w;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter width: ");
        w = sc.nextDouble();
        System.out.println("Area of Rectangle = " + (l * w));
    }
}