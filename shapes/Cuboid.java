package shapes;

import java.util.Scanner;

public class Cuboid implements Volume_cal {

    double l, b, h;

    public void volume() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input length, breadth, height:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();

        System.out.println("Volume of cuboid: " + (l * b * h));
    }
}