import java.util.Scanner;
interface Calc {
    void calculate();
}
class Bill implements Calc {
    String pid, pname;
    int quantity;
    double price, total;

    Scanner sc = new Scanner(System.in);
    public void getdata() {
        System.out.println("\nEnter product details");
        System.out.println("======================");
        System.out.print("Product id: ");
        pid = sc.nextLine();
        System.out.print("Product name: ");
        pname = sc.nextLine();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Price: ");
        price = sc.nextDouble();
        sc.nextLine(); 
    }
    public void calculate() {
        total = quantity * price;
    }
    public void display() {
        System.out.println(pid + "\t" + pname + "\t" + quantity + "\t" + price + "\t" + total);
    }
}
class Shop {
    public static void main(String[] args) {
        int n, i, order_no;
        double namount = 0;
        String date;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Bill details");
        System.out.println("======================");

        System.out.print("Order No: ");
        order_no = s.nextInt();

        System.out.print("Date: ");
        date = s.next();

        System.out.print("No. of products: ");
        n = s.nextInt();

        Bill ob[] = new Bill[n];

        for (i = 0; i < n; i++) {
            ob[i] = new Bill();
            ob[i].getdata();
            ob[i].calculate();
        }

        System.out.println("\nOrder No: " + order_no);
        System.out.println("Date: " + date);
        System.out.println("\nProductID\tName\tQty\tPrice\tTotal");
        System.out.println("--------------------------------------------------");

        for (i = 0; i < n; i++) {
            ob[i].display();
            namount += ob[i].total;
        }

        System.out.println("--------------------------------------------------");
        System.out.println("\t\tNet Amount = " + namount);

        s.close();
    }
}