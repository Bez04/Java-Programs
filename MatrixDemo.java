import java.util.Scanner;
public class MatrixDemo {
    public static void main(String[] args) {
        int row, col,i,j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        row = s.nextInt();
        System.out.print("Enter the number of columns: ");
        col = s.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix:");
        for (i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("The matrix you entered is:");
        for ( i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        s.close();
    }
}
