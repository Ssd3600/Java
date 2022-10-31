package QLCB;

public abstract class Canbo {
	private int SoTK;
	private String Hoten;
	private String GT;
	private String Diachi;
	private int Luong;
	
	public int getSoTK() {
		return SoTK;
	}
	public void setSoTK(int soTK) {
		SoTK = soTK;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getGT() {
		return GT;
	}
	public void setGT(String gT) {
		GT = gT;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	
	
public Canbo(){}
	public Canbo(int soTK, String hoten, String gT, String diachi, int luong) {
		super();
		SoTK = soTK;
		Hoten = hoten;
		GT = gT;
		Diachi = diachi;
		Luong = luong;
	}
	
}
