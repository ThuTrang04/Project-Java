package Bai1;
import java.text.SimpleDateFormat;
import java.util.Date;

// Lớp cha SinhVien
public class SinhVien {
    protected String maSV;
    protected String hoTen;
    protected String gioiTinh;
    protected Date ngaySinh;
    
    public SinhVien() {
    }
    
    public SinhVien(String maSV, String hoTen, String gioiTinh, Date ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }
    
    // Getter và Setter
    public String getMaSV() {
        return maSV;
    }
    
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public String getGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public Date getNgaySinh() {
        return ngaySinh;
    }
    
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    // Phương thức hiển thị thông tin chung
    public void hienThiThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Ngày sinh: " + sdf.format(ngaySinh));
    }
    
    // Phương thức để sắp xếp theo mã
    public String getMaSVDaSapXep() {
        return maSV;
    }
}