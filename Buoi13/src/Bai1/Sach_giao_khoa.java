package Bai1;

import java.time.LocalDate;

public class Sach_giao_khoa extends Sach {

    // Thuộc tính riêng của sách giáo khoa
    // true = sách mới, false = sách cũ
    private boolean TinhTrang;

    // Constructor đầy đủ
    public Sach_giao_khoa(String Masach, LocalDate Ngaynhap, double Dongia,
                        int Soluong, String Nhapsanxuat, boolean TinhTrang) {
        super(Masach, Ngaynhap, Dongia, Soluong, Nhapsanxuat);
        this.TinhTrang = TinhTrang;
    }

    // Constructor không tham số
    public Sach_giao_khoa() {
        super();
    }

    // Getter & Setter
    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    // Override phương thức tính tiền
    @Override
    public double ThanhTien() {
        // Sách mới: giá * số lượng
        // Sách cũ: giá * số lượng * 50%
        if (TinhTrang) {
            return Soluong * Dongia;
        } else {
            return Soluong * Dongia * 0.5;
        }
    }

    // Override toString
    @Override
    public String toString() {
        String trangThai = TinhTrang ? "Mới" : "Cũ";

        return String.format("SGK | %s | %s | %.2f | %d | %s | %s | %.2f",
                Masach,
                getNgaynhapFormatted(),
                Dongia,
                Soluong,
                Nhapsanxuat,
                trangThai,
                ThanhTien());
    }
}
