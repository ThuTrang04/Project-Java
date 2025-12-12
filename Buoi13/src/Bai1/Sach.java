package Bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
    protected String Masach;
    protected LocalDate Ngaynhap;
    protected double Dongia;
    protected int Soluong;
    protected String Nhapsanxuat;
   

    // Constructor có tham số
    public Sach(String Masach, LocalDate Ngaynhap, double Dongia, int Soluong, String Nhapsanxuat) {
        this.Masach = Masach;
        this.Ngaynhap = Ngaynhap;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
        this.Nhapsanxuat = Nhapsanxuat;
    }

    // Constructor không tham số
    public Sach() {
    }

    // GETTER
    public String getMasach() {
        return Masach;
    }

    public LocalDate getNgaynhap() {
        return Ngaynhap;
    }

    public double getDongia() {
        return Dongia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public String getNhapsanxuat() {
        return Nhapsanxuat;
    }

    // SETTER
    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public void setNgaynhap(LocalDate Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public void setNhapsanxuat(String Nhapsanxuat) {
        this.Nhapsanxuat = Nhapsanxuat;
    }

    // Phương thức tính tiền
    public double ThanhTien() {
        return Soluong * Dongia;
    }

    // Format ngày với LocalDate
    protected String getNgaynhapFormatted() {
        if (Ngaynhap == null) return "Chưa có";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Ngaynhap.format(fmt);
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %.2f | %d | %s | %.2f",
                Masach,
                getNgaynhapFormatted(),
                Dongia,
                Soluong,
                Nhapsanxuat,
                ThanhTien());
    }
}
