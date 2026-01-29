import java.util.Scanner;

public class Student {
    int rollno, m1, m2, m3;
    String name;
    int total;
    float average;

    void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Student Name, Rollno and Marks of 3 Subjects:");

        name = scan.nextLine();
        rollno = scan.nextInt();
        m1 = scan.nextInt();
        m2 = scan.nextInt();
        m3 = scan.nextInt();
    }

    void call() {
        total = m1 + m2 + m3;
        average = total / 3.0f;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Student r = new Student();
        r.getData();

        System.out.println("\nStudent Details\n");
        System.out.println("Name: " + r.name);
        System.out.println("Roll No: " + r.rollno);

        r.call();
    }
}
