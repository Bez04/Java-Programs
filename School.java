import java.util.Scanner;

class Sports {
    String sport;
    int rating;

    Sports(String sp, int rt) {
        this.sport = sp;
        this.rating = rt;
    }
}

class Student extends Sports {
    String grade;
    double overall_per;

    Student(String gd, double per, String sp, int rt) {
        super(sp, rt);
        this.grade = gd;
        this.overall_per = per;
    }
}

class Result extends Student {

    Result(String gd, double per, String sp, int rt) {
        super(gd, per, sp, rt);
    }

    void display() {
        System.out.println("\nSport Details of the Student:");
        System.out.println("------------------------------");
        System.out.println("Sport: " + sport);
        System.out.println("Rating: " + rating);

        System.out.println("\nAcademic Details of the Student:");
        System.out.println("------------------------------");
        System.out.println("Grade: " + grade);
        System.out.println("Overall Percentage: " + overall_per);
    }
}

public class School {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Sports Details of the Student:");
        System.out.print("Sport: ");
        String sp = s.nextLine();

        System.out.print("Sport Rating out of 10: ");
        int rt = s.nextInt();

        s.nextLine(); 

        System.out.println("Enter Academic Details of the Student:");
        System.out.print("Academic Grade (A-D): ");
        String gd = s.nextLine();

        System.out.print("Overall Percentage: ");
        double per = s.nextDouble();

        Result ob = new Result(gd, per, sp, rt);
        ob.display();

        s.close();
    }
}