import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IOExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;
        double score = 0;
        char gender = ' ';

        // ===============================
        // 1. Nhập dữ liệu + xử lý ngoại lệ
        // ===============================
        try {
            System.out.print("Nhập tên sinh viên: ");
            name = scanner.nextLine();

            System.out.print("Nhập tuổi: ");
            age = scanner.nextInt();

            System.out.print("Nhập điểm trung bình: ");
            score = scanner.nextDouble();

            System.out.print("Nhập giới tính (M/F): ");
            gender = scanner.next().charAt(0);

        } catch (InputMismatchException e) {
            System.out.println("❌ Lỗi: Bạn nhập sai kiểu dữ liệu!");
            return;
        }

        // ===============================
        // 2. Xuất dữ liệu
        // ===============================

        // print()
        System.out.print("\n--- Thông tin sinh viên ---\n");

        // println()
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);

        // printf() + specifier
        System.out.printf("Điểm TB: %.2f\n", score); // %f
        System.out.printf("Giới tính: %c\n", gender); // %c

        // ===============================
        // 3. Ghi file văn bản
        // ===============================
        String fileName = "student.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Tên: " + name + "\n");
            writer.write("Tuổi: " + age + "\n");
            writer.write(String.format("Điểm TB: %.2f\n", score));
            writer.write("Giới tính: " + gender + "\n");

            System.out.println("\n✅ Đã ghi dữ liệu vào file student.txt");

        } catch (IOException e) {
            System.out.println("❌ Lỗi ghi file!");
        }

        // ===============================
        // 4. Đọc file văn bản
        // ===============================
        System.out.println("\n--- Nội dung đọc từ file ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("❌ Lỗi đọc file!");
        }

        scanner.close();
    }
}
