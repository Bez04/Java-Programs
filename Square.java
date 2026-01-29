public class Square
{
    double side;
    void getInput(double s)
    {
        side=s;
    }
    double calArea()
    {
       return side*side;
    }
    public static void main(String[] args) 
    {
        Square obj=new Square();
        obj.getInput(10);
        System.out.println("Area Of Square :"+obj.calArea());
    }
    
}

