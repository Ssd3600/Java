package GGV;

public abstract class Person {
	private int MaDD;
	private String Hoten;
	private String GT;
	
	public void setMaDD(int maDD) {
		MaDD = maDD;
	}
	
	public int getMaDD() {
		return MaDD;
	}
	
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	
	public String getHoten() {
		return Hoten;
	}
	
	public void setGT(String gt) {
		GT = gt;
	}
	
	public String getGT(String GT) {
		return GT;
	}
	
	public Person() {
		
	}
	
	public Person(int maDD, String hoten, String gt) {
		super();
		MaDD = maDD;
		Hoten = hoten;
		GT = gt;
	}
	
	public abstract String Xetthuong();
}
