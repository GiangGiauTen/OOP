// Exercise 6.2: Write a program for input/output from keyboard

// Le Truong Giang 20205077
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Đọc tên từ bàn phím
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        // Lấy thông tin về tuổi
        System.out.println("How old are you ?");
        int iAge = keyboard.nextInt();
        // Lấy thông tin chiều cao
        System.out.println("How tall are you(m)");
        double dHeight = keyboard.nextDouble();
        // In thông tin người dùng nhập ra màn hình
        System.out.println("Mrs/Ms. " + strName + ". " + iAge + " years old. " + "Your height is " + dHeight);
        System.exit(0);
    }
}
