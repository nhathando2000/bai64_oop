package donguyennhathan.com.test;

import donguyennhathan.com.model.SanPham;

public class TestSp {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham(1,"Coca",25);
		SanPham sp2 = new SanPham(2,"Pepsi",20);
		SanPham sp3 = new SanPham(3, "C2", 10);
		double t= SanPham.tongTien(sp1,sp2,sp3);
		System.out.println("Tổng tiền sp: "+t);
	}

}
