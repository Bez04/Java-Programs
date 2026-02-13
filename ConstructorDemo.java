 class Student1
{
    int rno;
    String name;
    Student1(int r,String n)
    {
        rno=r;
        name=n;
    }
    void display()
    {
        System.out.println("Student Details");
        System.out.println("------------------");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rno);
    }
} 
public class ConstructorDemo{
    public static void main(String[] args) 
    {
        Student1 ob=new Student1(12, "Anu");
        ob.display();

    }
}