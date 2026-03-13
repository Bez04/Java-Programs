class Principal
{
    String name = "Rakesh";
}

class Teacher extends Principal
{
    int tchrId = 56;
}

class Student extends Teacher
{
    int rno = 23;

    void display()
    {
        System.out.println("Principal Name: " + name);
        System.out.println("Teacher Id: " + tchrId);
        System.out.println("Student Rollno: " + rno);
    }
}

class Multilevel
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();
    }
}
    

