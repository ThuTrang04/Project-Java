package Bai1;

import java.time.LocalDate;

public class Sach_tham_khao extends Sach {

    private double Thue;

    public Sach_tham_khao (String Masach, LocalDate Ngaynhap, double Dongia,
                        int Soluong, String Nhapsanxuat, double Thue) {
        super(Masach, Ngaynhap, Dongia, Soluong, Nhapsanxuat);
        this.Thue = Thue;
    }

    public Sach_tham_khao() {
        super();
    }

    public double getThue() {
        return Thue;
    }

    public void setThue(double Thue) {
        this.Thue = Thue;
    }

    @Override
    public double ThanhTien() {
        return Soluong * Dongia + Thue;
    }

    @Override
    public String toString() {
        return String.format("STK | %s | %s | %.2f | %d | %s | Thuế: %.2f | %.2f",
                Masach,
                getNgaynhapFormatted(),
                Dongia,
                Soluong,
                Nhapsanxuat,
                Thue,
                ThanhTien());
    }
}
