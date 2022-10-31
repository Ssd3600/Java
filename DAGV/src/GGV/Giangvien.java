package GGV;

public class Giangvien extends Person {
	String Donvi;
	int Soct;
	public Giangvien() {}
	public Giangvien(int maDD, String hoten, String gt, String donvi, int soct) {
		super(maDD, hoten, gt);
		Donvi = donvi;
		Soct = soct;
	}
	
	public String getDonvi() {
		return Donvi;
	}
	public void setDonvi(String donvi) {
		Donvi = donvi;
	}
	public int getSoct() {
		return Soct;
	}
	public void setSoct(int soct) {
		Soct = soct;
	}
	@Override
	public String Xetthuong() {
		// TODO Auto-generated method stub
		String khen = "Khen thưởng";
		String kkhen = "Đối tượng không được khen thưởng";
		if (Soct > 10) {
			return khen;
		}
		else {
			return kkhen;
		}
		
	}
	
}
