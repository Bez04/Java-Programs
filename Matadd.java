import java.util.Scanner;

class MatrixAddition {

    int r1, r2, c1, c2;
    int[][] mat1, mat2, res;

    void getData() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        r1 = s.nextInt();
        c1 = s.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        r2 = s.nextInt();
        c2 = s.nextInt();

        if (r1 == r2 && c1 == c2) {

            mat1 = new int[r1][c1];
            mat2 = new int[r2][c2];
            res = new int[r1][c1];

            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    mat1[i][j] = s.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    mat2[i][j] = s.nextInt();
                }
            }

        } else {
            System.out.println("Matrix addition not possible");
        }
    }

    void addMatrix() {
        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    res[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        }
    }

    void display() {
        if (r1 == r2 && c1 == c2) {
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(res[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}

class MAdd {
    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();

        obj.getData();
        obj.addMatrix();
        obj.display();
    }
}
