package donguyennhathan.com.test;

import donguyennhathan.com.model.SinhVien;

public class TestSV {

	public static void main(String[] args) {
		SinhVien teo= new SinhVien(1, "Tèo", 9.0);
		teo.xetTotNghiep();
		teo.xetTotNghiep(4.0);
		teo.xetTotNghiep(8.0, 100);
	}

}
