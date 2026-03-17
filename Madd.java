import java.util.Scanner;

class MatrixAddition {

    int r, c;
    int[][] mat1, mat2, res;

    // Method to get matrix data
    void getData() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        r = s.nextInt();
        c = s.nextInt();

        mat1 = new int[r][c];
        mat2 = new int[r][c];
        res = new int[r][c];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = s.nextInt();
            }
        }
    }

    // Method to perform addition
    void addMatrix() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }

    // Method to display result
    void display() {
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();

        obj.getData();
        obj.addMatrix();
        obj.display();
    }
}
