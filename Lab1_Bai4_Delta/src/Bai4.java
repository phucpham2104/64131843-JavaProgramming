import java.util.Scanner;

public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			//Nhap he so phuong trinh bac 2
			System.out.print("Nhap he so a: ");
			double a = scanner.nextDouble();
			
			System.out.print("Nhap he so b: ");
			double b = scanner.nextDouble();
			
			System.out.print("Nhap he so c: ");
			double c = scanner.nextDouble();
			
			//Tinh delta
			double delta = Math.pow(b, 2) - 4*a*c;
			double canDelta = Math.sqrt(Math.abs(delta));
			
			//xuat ket qua ra man hinh
			System.out.println("\nGia tri delta: "+delta);
			System.out.println("Can delta: "+canDelta);
		}catch (Exception e) {
			System.out.println("Loi dang nhap du lieu! Vui long nhap lai dung dinh dang");
		}finally {
			scanner.close();
		}

	}

}