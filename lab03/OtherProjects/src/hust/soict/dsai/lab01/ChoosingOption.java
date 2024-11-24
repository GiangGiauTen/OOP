
// Exercies 6.1: ChoosingOption program:
// Le Truong Giang 20205077
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Các option mặc của dialog
        Object[] options = { "I do", "I don't" };
        // Lấy lựa chọn của người sử dụng
        int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket", null,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, // Không dùng icon
                options, // Nội dung của các nút
                options[0]);
        // Nếu đồng ý thì hiển thị yes, ngược lại hiển thị no
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
