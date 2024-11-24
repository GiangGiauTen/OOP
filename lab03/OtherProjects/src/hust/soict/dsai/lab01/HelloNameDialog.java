
/*
    Example 3: HelloNameDialog.java
    Nhập tên và hiển thị tên
    author: Le Truong Giang 20205077
 */
import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + result + " !");
        System.exit(0);
    }
}
