
// Exercise 6.4:
// Le Truong Giang 20205077
import java.util.HashMap;
import java.text.DateFormatSymbols;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberDaysOfMonth {
    static HashMap<String, Integer> daysOfMonthList = new HashMap<String, Integer>();

    public static void main(String[] args) {
        // Khởi tạo HashMap có dạng: key, value là: Tháng, số ngày trong tháng và lưu
        // vào HashMap
        // Nhập tháng và năm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = sc.nextLine();
        System.out.print("Enter year: ");
        int year;
        try {
            year = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid year");
            return;
        }
        // Kiểm tra tính hợp lệ của năm
        if (year < 1000) {
            System.out.println("Year must have 4 digits");
            System.exit(0);
        }
        // Lấy danh sách tháng ở dạng thường: January, February,...
        String[] Months = new DateFormatSymbols().getMonths();
        for (int i = 0; i < Months.length - 1; i++) {
            daysOfMonthList.put(Months[i].toLowerCase(), getDaysOfMonth(i + 1, year)); // Lưu dữ liệu vào hash map ở
                                                                                       // dạng: Tên tháng: Số ngày trong
                                                                                       // tháng đó
        }

        // Lấy danh sách tháng ở dạng short: Jan, Feb,... và lưu vào HashMap
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        for (int i = 0; i < shortMonths.length - 1; i++) {
            daysOfMonthList.put(shortMonths[i].toLowerCase(), getDaysOfMonth(i + 1, year)); // Lưu dữ liệu vào hash map
                                                                                            // ở dạng: Tên tháng: Số
                                                                                            // ngày trong tháng đó
        }

        try {
            // Nếu người dùng nhập vào tháng ở dạng số
            int num = Integer.parseInt(month);
            printDaysOfMonth(num, year);
        } catch (NumberFormatException e) {
            // Nếu không ở dạng số
            printDaysOfMonth(month);
        }

    }

    public static int getDaysOfMonth(int month, int year) {
        // Lấy số ngày trong tháng
        if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            // Nếu năm đó là năm nhuận
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                return 29;
            }
            // Không phải năm nhuận
            return 28;
        } else {
            return 30;
        }
    }

    public static void printDaysOfMonth(int month, int year) {
        if (month > 12 || month < 1) {
            System.out.println("The month you entered is invalid");
            System.exit(0);
        }
        int days = getDaysOfMonth(month, year);
        System.out.printf("Number of days in the month %d of year %d is: %d", month, year, days);
        System.exit(0);
    }

    public static void printDaysOfMonth(String month) {
        // Xóa dấu "." trong chuỗi nếu có
        month = month.replace(".", "");
        month = month.toLowerCase();
        boolean isExist = daysOfMonthList.containsKey(month);

        if (isExist == true) {
            // Nếu tên tháng chính xác
            int days = daysOfMonthList.get(month);
            System.out.printf("Number of days in the month %s is: %d", month, days);
        } else {
            // Nếu không
            System.out.printf("The month you entered is incorrect.");
        }
        System.exit(0);
    }
}
