package Bai1;
import java.util.ArrayList;

public class Xuly {
    private ArrayList<Sach> ds = new ArrayList<>();

    public void themSach(Sach s) {
        ds.add(s);
    }

    // Tổng thành tiền theo loại
    public double tongSGK() {
        double sum = 0;
        for (Sach s : ds) {
            if (s instanceof Sach_giao_khoa) sum += s.ThanhTien();
        }
        return sum;
    }

    public double tongSTK() {
        double sum = 0;
        for (Sach s : ds) {
            if (s instanceof Sach_tham_khao) sum += s.ThanhTien();
        }
        return sum;
    }

    // Trung bình đơn giá của sách tham khảo
    public double TBdonGiaSTK() {
        double tong = 0; int count = 0;
        for (Sach s : ds) {
            if (s instanceof Sach_tham_khao) {
                tong += s.getDongia();
                count++;
            }
        }
        return count == 0 ? 0 : tong / count;
    }

    // Xuất SGK theo nhà xuất bản
    public void xuatSGK_NXB(String NSX) {
        for (Sach s : ds) {
            if (s instanceof Sach_giao_khoa && s.getNhapsanxuat().equalsIgnoreCase(NSX)) {
                System.out.println(s);
            }
        }
    }

    public void xuatToanBo() {
        for (Sach s : ds) System.out.println(s);
    }
}
