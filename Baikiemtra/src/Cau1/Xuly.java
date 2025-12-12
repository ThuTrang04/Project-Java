package Cau1;
import java.util.*;

import Cau1.CD;
import Cau1.Xuly;

public class Xuly {
	Scanner inform = new Scanner(System.in);
	public int inputINT() {
		int result;
		while (true) {
			try {
				result = inform.nextInt();
				if (result>0 ) {
					break;
				}
				System.out.print("Vui lòng nhập lại dữ liệu lớn hơn 0: ");
			} catch (InputMismatchException e) {
				System.err.println("! Lỗi dữ liệu: Vui lòng chỉ nhập số nguyên.");
				System.out.print("Vui lòng nhập lại dữ liệu: ");
				inform.next();
				continue;
			}
		}
		return result;
	}
	
	public int add_macd(ArrayList<CD> ds) {
		if (ds.isEmpty()) {
			return 0;
		}else {
			return ds.size();
		}
	}
	
	public void danhsachCD(ArrayList<CD> ds, int n) {
		for (int i = 0; i<n;i++) {
			CD cd = new CD();
			System.out.println("");
			System.out.println("Nhập CD thứ "+ i);
			cd.taoCD();
			cd.MaCD=add_macd(ds);
			ds.add(cd);
		}
	}
	
	public void xuatdanhsachCD(ArrayList<CD> ds) {
		for (int i = 0; i<ds.size();i++) {
			System.out.println("");
			ds.get(i).xuatCD();
		}
	}
	
	public void tinhCD(ArrayList<CD> ds) {
		System.out.println("Tổng số CD là: " + ds.size());
		float result = 0;
		if (ds.isEmpty()) {
			System.out.println("Không có CD nào để tính toán");
		} else {
			for (int i = 0; i<ds.size();i++) {
				result = result + ds.get(i).GiaThanh;
			}
			System.out.println("Tổng số giá thành của các CD là: " + result);
		}
		
	}
	
	public void sapXepTheoTua(ArrayList<CD> ds) {
        Collections.sort(ds, new Comparator<CD>() {
            
            public int compare(CD a, CD b) {
                return a.tuaCD.compareToIgnoreCase(b.tuaCD);
            }
        });

        System.out.println("✔ Đã sắp xếp theo tựa CD!");
    }
	
	public void xuatdanhsachCD_CaSy(ArrayList<CD> ds, String dk) {
		int check = 0;
		for (int i = 0; i<ds.size();i++) {
			if (ds.get(i).CaSy.equalsIgnoreCase(dk)) {
				System.out.println("");
				ds.get(i).xuatCD();
				check =1;
			}
		}
		if (check==0) {
			System.out.println("Không tìm thấy CD của ca sỹ (đã nhập)");	
		}
	}

}
