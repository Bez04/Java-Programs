import java.util.Scanner;

class Employee {
    int empid, basic, TA, DA, HRA, tax, netsalary;
    String empname;

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        empid = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        System.out.println("Enter Employee Name:");
        empname = sc.nextLine();

        System.out.println("Enter Basic Salary:");
        basic = sc.nextInt();

        System.out.println("Enter TA:");
        TA = sc.nextInt();

        System.out.println("Enter DA:");
        DA = sc.nextInt();

        System.out.println("Enter HRA:");
        HRA = sc.nextInt();

        System.out.println("Enter TAX:");
        tax = sc.nextInt();
    }

    void calc() {
        netsalary = (basic + TA + DA + HRA) - tax;
    }

    void display() {
        System.out.println("\nEmployee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Net Salary: " + netsalary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getdata();
        System.out.println("\nEmployee Details");
        System.out.println("-------------------");
        e.calc();
        e.display();
    }
}
