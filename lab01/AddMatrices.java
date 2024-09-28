// Exercise 6.6: Write a Java program to add two matrices of the same size.

// Le Truong Giang 20205077
import java.util.Arrays;
import java.util.Scanner;

public class AddMatrices {
    static int countRow = 2;
    static int countColumn = 2;

    public static void main(String[] args) {

        System.out.println("Select dataset");
        System.out.println("1. Manual input");
        System.out.println("2. Use default data");
        System.out.print("Enter your selection: ");
        Scanner sc = new Scanner(System.in);
        int chosen = sc.nextInt();
        int[][] matrix1;
        int[][] matrix2;
        // Nhập dữ liệu từ bàn phím
        if (chosen == 1) {
            System.out.print("Enter the number of rows and columns of the matrix: ");
            countRow = sc.nextInt(); // Lấy số hàng
            countColumn = sc.nextInt(); // Lấy số cột
            if (countRow < 1 || countColumn < 1) {
                System.out.println("Invalid row and column number");
                return;
            }

            matrix1 = new int[countRow][countColumn];
            matrix2 = new int[countRow][countColumn];
            // Nhập Thông tin ma trận 1
            System.out.println("Enter the elements of matrix 1");
            for (int i = 0; i < countRow; ++i) {
                System.out.printf("Row %d: ", i + 1);
                for (int j = 0; j < countColumn; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            // Nhập Thông tin ma trận 2
            System.out.println("Enter the elements of the matrix 2");
            for (int i = 0; i < countRow; ++i) {
                System.out.printf("Row %d: ", i + 1);
                for (int j = 0; j < countColumn; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
        } else if (chosen == 2) {
            // Bộ dữ liệu mặc định
            matrix1 = new int[][] {
                    { 2, 3 }, { 6, 7 }
            };
            matrix2 = new int[][] {
                    { 66, 53 }, { 0, 1 }
            };
        } else {
            System.out.println("Your selection is invalid, please check again");
            return;
        }

        // Thực hiện in ma trận và tính toán
        System.out.println("========================");
        System.out.println("Matrix 1: ");
        printMatrix(matrix1);

        System.out.println("Matrix 2: ");
        printMatrix(matrix2);

        System.out.println("Sum of 2 matrices");
        printMatrix(sumMatrix(matrix1, matrix2));
    }

    // Tính tổng 2 ma trận
    public static int[][] sumMatrix(int[][] maxtrix1, int[][] maxtrix2) {
        int[][] sum = new int[countRow][countColumn];
        for (int i = 0; i < countRow; ++i) {
            for (int j = 0; j < countColumn; j++) {
                sum[i][j] = maxtrix1[i][j] + maxtrix2[i][j];
            }
        }
        return sum;
    }

    // In ma trận
    public static void printMatrix(int[][] matrix) {
        // Sử dụng Arrays.toString() đê in ma trận 1 cấp
        for (int i = 0; i < matrix.length; ++i) {
            String str = Arrays.toString(matrix[i]);
            str = str.replace("[", "");
            str = str.replace("]", "");
            System.out.println(str);
        }
    }
}
