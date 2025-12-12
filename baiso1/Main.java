package buoi9.baiso1;

import Library.Library;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = Library.getInt("Nhập số lượng hộ dân: ");
        List<BienLai> danhSachBienLai = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho hộ dân thứ " + (i + 1) + ":");
            BienLai bienLai = new BienLai();
            bienLai.nhapBienLai();
            bienLai.tinhTienDien();
            danhSachBienLai.add(bienLai);
        }

        System.out.println("\n--- DANH SÁCH BIÊN LAI TIỀN ĐIỆN ---");
        for (int i = 0; i < danhSachBienLai.size(); i++) {
            System.out.println("\nThông tin biên lai thứ " + (i + 1) + ":");
            danhSachBienLai.get(i).hienThiBienLai();
        }

        Library.close();
    }
}
