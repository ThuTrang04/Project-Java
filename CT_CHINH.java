package bai8.src;
public class CT_CHINH {

	public static void main(String[] args) 
	{
		//hàm dựng có tham số
		PHANSO ps = new PHANSO(4,8);
		ps.xuatPS();
		
		//hàm dự rỗng
		PHANSO ps1 = new PHANSO();
		System.out.println("Nhập Phân số 1:"); 
		ps1.nhapPS();
		
		PHANSO ps2 = new PHANSO();
		System.out.println("Nhập Phân số 2:"); 
		ps2.nhapPS();
		
		// RGPS(ps1)
		
		ps1.cong2PS(ps2);

	}

}