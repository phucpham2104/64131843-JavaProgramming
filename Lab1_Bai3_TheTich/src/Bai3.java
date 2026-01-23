import java.util.Scanner;

public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			//Nhap canh cua khoi lap phuong
			System.out.print("nhap canh cua khoi lap phuong: ");
			double canh = scanner.nextDouble();
			
			//Tinh the tich
			double theTich = Math.pow(canh, 3);
			
			//xuat ket qua ra man hinh
			System.out.println("\nThe tich cua khoi lap phuong: "+theTich);
		}catch(Exception e) {
			System.out.println("Loi nhap du lieu! Vui long nhap lai dung dinh dang");
		}finally {
			scanner.close();
		}
}