import java.util.Scanner;
public class Authentication
{
    public static void main(String[] args)
    {
        String username = "Abu";
        String password = "@Abu123";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String u1 = sc.nextLine();
        System.out.print("Enter password: ");
        String p1 = sc.nextLine();
        try
        {
            if(u1.equals(u1) && p1.equals(p1))
            {
                System.out.println("Acess Granted!!");
            }
            else
            {
                throw new CredentialException("Invalid username or password.");
            }
        }
        catch(CredentialException e)
        {
            System.out.println(e.getMessage());
        }
    }
}