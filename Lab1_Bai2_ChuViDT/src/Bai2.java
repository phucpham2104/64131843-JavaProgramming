import java.util.Scanner;

public class Bai2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			//Nhap hai canh cua hinh chu nhat
			System.out.print("Nhap chieu dai: ");
			double chieuDai = scanner.nextDouble();
			
			System.out.print("Nhap chieu rong: ");
			double chieuRong = scanner.nextDouble();
			
			//Tinh chu vi,dien tich va canh nho
			double chuVi = 2* (chieuDai + chieuRong);
			double dienTich = chieuDai * chieuRong;
			double canhNho = Math.min(chieuDai,  chieuRong);
			
			//xuat ket qua ra man hinh
			System.out.println("\nThong tin hinh chu nhat: ");
			System.out.println("Chu vi: "+chuVi);
			System.out.println("Dien tich: "+dienTich);
			System.out.println("Canh nho nhat: "+canhNho);
		}catch (Exception e) {
			System.out.println("loi nhap du lieu!Vui long nhap lai dung dinh dang");
		}finally {
			scanner.close();
		
		}

	}
}