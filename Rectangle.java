public class Rectangle 
{
    double length,breadth;
    void getInput(double l,double b)
    {
        length=l;
        breadth=b;
    }
    double calArea()
    {
       return length*breadth;
    }
    public static void main(String[] args) 
    {
        Rectangle obj=new Rectangle();
        obj.getInput(12.48,13);
        System.out.println("Area Of Rectangle :"+obj.calArea());
    }
    
}
