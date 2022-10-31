package QLCB;

import java.sql.Connection;

public interface ICanbo {
	public Connection getCon();
	public boolean insertCB(int soTK, String hoten, String gT, String diachi, int luong);
}
