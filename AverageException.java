import java.util.Scanner;
public class AverageException
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of integers:");
        int n=sc.nextInt();
        System.out.println("Enter the integers:");
        try
        {
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            if(num<0)
            {
                throw new inputException(" Numbers are not allowed");
            }
                sum+=num;
            }
            float avg=(float)sum/n;
            System.out.println("The average is:"+avg);
            }
            catch(inputException e)
            {
                System.out.println(e);
             }
        }
        
    }

