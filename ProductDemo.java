class Product
{
    int pcode;
    String pname;
    double price;
    double lowest;
    Product(int c,String n,double p)
    {
      pcode=c;
      pname=n;
      price=p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
    }
    void FindLowest(double price1,double price2,double price3)
    {
      if(price1<=price2 && price1<=price3)
      {
        System.out.println("\nProduct 1 is of Lowest Price!");
      }
      else if(price2<=price1&&price2<=price3)
      {
        System.out.println("\nProduct 2 is of Lowest Price!");
      }
      else
      {
        System.out.println("\nProduct 3 is of Lowest Price!");
      }
    }
}
public  class ProductDemo {
    public static void main(String[] args) {
        Product p1=new Product(101,"Laptop",55000);
        Product p2=new Product(102,"Tablet",25000);
        Product p3=new Product(103,"Smartphone",15000);
        System.out.println("Pcode\t\tPname\t\tPrice");
        p1.display();
        p2.display();
        p3.display();
        p1.FindLowest(p1.price,p2.price,p3.price);
    }
}