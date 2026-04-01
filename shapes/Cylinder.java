package shapes;

import java.util.Scanner;

public class Cylinder implements Volume_cal {

    double r, h;

    public void volume() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input radius & height:");
        r = sc.nextDouble();
        h = sc.nextDouble();

        System.out.println("Volume of cylinder: " + (3.14 * r * r * h));
    }
}