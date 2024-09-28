// Exercise 6.5 : Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.
// Le Truong Giang 20205077

import java.util.Scanner;
import java.util.Arrays;

public class NumericArray {

    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        double avg;
        int[] numbers;
        // Menu chọn dữ liệu đầu vào
        System.out.println("Input data");
        System.out.println("1. Enter data");
        System.out.println("2. Using available datasets");
        System.out.print("Please select: ");
        // Lấy giá trị mà người dùng nhập
        Scanner sc = new Scanner(System.in);
        int chosen = sc.nextInt();
        if (chosen == 1) {
            // Nếu người dùng nhập dữ liệu
            System.out.println("Enter the number of elements in the array");
            count = sc.nextInt();
            System.out.println("Enter elements separated by spaces");
            // Tạo mảng n phần tử
            numbers = new int[count];
            for (int i = 0; i < count; i++) {
                numbers[i] = sc.nextInt();
            }
        } else if (chosen == 2) {
            // Nếu sử dụng bộ dữ liệu mặc định
            numbers = new int[] { 3, 4, 5, 99, -1, 22 };
            count = numbers.length;
        } else {
            System.out.println("Invalid selection");
            return;
        }

        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        // Sắp xếp mảng tăng dần
        sortArr(numbers);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
        // Tính tổng và trung bình cộng của mảng
        sum = sumArr(numbers);
        System.out.printf("The sum of the numbers in the array is: %f\n", sum);
        avg = (double) (sum / count);
        System.out.printf("The average of the numbers in the array is: %f\n", avg);
    }

    public static void sortArr(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static double sumArr(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];
        }
        return sum;
    }
}
