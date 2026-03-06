import java.util.Scanner;
public class StringManip 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str1= sc.nextLine();
        System.out.println("Length of string="+str1.length());
        System.out.println("Character of 2nd position="+str1.charAt(1));
        System.out.println("String contains 'ple' Sequence:"+str1.contains("ple"));
        System.out.println("String end with e:"+str1.endsWith("e"));
        System.out.println("Replace 'pp' with 'nk':"+str1.replaceAll("pp", "nk"));
        System.out.println("Lowercase:"+str1.toLowerCase());
        System.out.println("Uppercase:"+str1.toUpperCase());
        System.out.println("Index of 'e':"+str1.indexOf("e"));
        System.out.println("Substring from index 2:"+str1.substring(2));
        System.out.println("Enter 2nd String:");
        String str2=sc.nextLine();
        System.out.println("String 1 consatenated with String 2:"+str1.concat(str2));
    }
}