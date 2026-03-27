package graphics;
import java.util.Scanner;

public class Square {
    double s;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        s = sc.nextDouble();
        System.out.println("Area of Square = " + (s * s));
    }
}