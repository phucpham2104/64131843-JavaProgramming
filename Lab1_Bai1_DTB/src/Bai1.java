import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		
		
		// Nhập họ và tên sinh viên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        
        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();
        
        // Xuất thông tin sinh viên ra màn hình
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        
        scanner.close();
	}
}