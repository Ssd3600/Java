package QLCB;

import java.util.Scanner;

public class Test_insertCB {
	private static QLCB qlcb = new QLCB();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tai khoan");
		int soTK = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten: ");
		String hoten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		String gT = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		String diachi = sc.nextLine();
		System.out.println("Nhap luong: ");
		int luong = sc.nextInt();
		doInsertCB(soTK, hoten, gT, diachi, luong);
	}
	
	public static void doInsertCB(int soTK, String hoten, String gT, String diachi, int luong) {
		
		boolean checkInsert = qlcb.insertCB(soTK, hoten, gT, diachi, luong);
			if (checkInsert) {
				System.out.println("Them thanh cong");
			}
			else {
				System.out.println("Them khong thanh cong");
				
			}

	}
}
