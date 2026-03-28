import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the file name to read/write: ");
            String fname = scanner.nextLine();

            FileWriter obW = new FileWriter(fname, true);

            System.out.print("Enter number of entries in file: ");
            int n = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Enter " + n + " entries into file:");
            String data;

            for (int i = 0; i < n; i++) {
                data = scanner.nextLine();
                obW.write(data + "\n");
            }
            obW.close();

            FileReader obR = new FileReader(fname);
            BufferedReader br = new BufferedReader(obR);

            String line;
            System.out.println("Data read from " + fname + " file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            obR.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}