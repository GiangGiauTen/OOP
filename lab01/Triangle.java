
// Le Truong Giang 20205077

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        // Số dòng cần in
        for (int i = 0; i < n; i++) {
            // Số khoảng trắng từng dòng.Cách tính: Số khoảng trắng = Số dòng - Số thứ tự
            // dòng hiện tại
            for (int m = 0; m < (n - i); m++) {
                System.out.print(" ");
            }
            // In dấu * . Số dấu * cần in = 2*số thứ tự dòng + 1
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Kết thúc 1 dòng
            System.out.println("");
        }
    }
}
