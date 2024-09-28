
/*
    Example: 2.2.5
    Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
    // Le Truong Giang 20205077
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaculatorNumber {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public CaculatorNumber() {
        prepareGUI();
    }

    /**
     * Tạo gui
     */
    private void prepareGUI() {
        mainFrame = new JFrame("Máy tính cầm tay");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(3, 2));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        CaculatorNumber swingDemo = new CaculatorNumber();
        swingDemo.showTextFieldDemo();
    }

    /*
     * Tạo các thành phần và xử lý tính toán trong GUI
     */
    private void showTextFieldDemo() {
        headerLabel.setText("Nhập 2 số cần thực hiện phép tính");
        JLabel number1Label = new JLabel("Số thứ nhất: ", JLabel.RIGHT);
        JLabel number2Label = new JLabel("Số thứ hai: ", JLabel.CENTER);
        final JTextField number1Text = new JTextField(8);
        final JTextField number2Text = new JTextField(8);

        JButton addButton = new JButton("Cộng");
        JButton differenceButton = new JButton("Trừ");
        JButton productButton = new JButton("Nhân");
        JButton quotientButton = new JButton("Chia");

        // Khi người dùng bấm button "Cộng"
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                String resultText = "Kết quả của phép tính là: ";
                double result = num1 + num2;
                resultText += String.valueOf(result);
                statusLabel.setText(resultText);
            }
        });

        // Khi người dùng bấm button "Trừ"
        differenceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                String resultText = "Kết quả của phép tính là: ";
                double result = num1 - num2;
                resultText += String.valueOf(result);
                statusLabel.setText(resultText);
            }
        });

        // Khi người dùng bấm button "Nhân"
        productButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                String resultText = "Kết quả của phép tính là: ";
                double result = num1 * num2;
                resultText += String.valueOf(result);
                statusLabel.setText(resultText);
            }
        });

        // Khi người dùng bấm button "Chia"
        quotientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                String resultText;
                if (num2 == 0) {
                    resultText = "Số thứ 2 phải khác 0";
                } else {
                    resultText = "Kết quả của phép tính là: ";
                    double result = num1 / num2;
                    resultText += String.valueOf(result);
                }

                statusLabel.setText(resultText);
            }
        });

        controlPanel.add(number1Label);
        controlPanel.add(number1Text);
        controlPanel.add(number2Label);
        controlPanel.add(number2Text);

        controlPanel.add(addButton);
        controlPanel.add(differenceButton);
        controlPanel.add(productButton);
        controlPanel.add(quotientButton);

        mainFrame.setVisible(true);
    }
}
