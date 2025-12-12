package Bai1;
import java.util.Date;

// Lớp SinhVienCaoDang kế thừa từ SinhVien
public class SinhVienCaoDang extends SinhVien {
    private double diemThiTotNghiep;
    private String xepLoai;
    
    public SinhVienCaoDang() {
        super();
    }
    
    public SinhVienCaoDang(String maSV, String hoTen, String gioiTinh, Date ngaySinh, double diemThiTotNghiep) {
        super(maSV, hoTen, gioiTinh, ngaySinh);
        this.diemThiTotNghiep = diemThiTotNghiep;
        this.xepLoai = tinhXepLoai();
    }
    
    public double getDiemThiTotNghiep() {
        return diemThiTotNghiep;
    }
    
    public void setDiemThiTotNghiep(double diemThiTotNghiep) {
        this.diemThiTotNghiep = diemThiTotNghiep;
        this.xepLoai = tinhXepLoai();
    }
    
    public String getXepLoai() {
        return xepLoai;
    }
    
    // Tính xếp loại dựa trên điểm
    private String tinhXepLoai() {
        if (diemThiTotNghiep >= 8.5) {
            return "Giỏi";
        } else if (diemThiTotNghiep >= 7.0) {
            return "Khá";
        } else if (diemThiTotNghiep >= 5.5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
    
    // Kiểm tra được nhận thưởng
    public boolean duocNhanThuong() {
        return xepLoai.equals("Giỏi");
    }
    
    // Hiển thị toàn bộ thông tin
    public void hienThiToanBoThongTin() {
        System.out.println("=== THÔNG TIN SINH VIÊN CAO ĐẲNG ===");
        hienThiThongTin();
        System.out.println("Điểm thi tốt nghiệp: " + diemThiTotNghiep);
        System.out.println("Xếp loại: " + xepLoai);
        System.out.println("Thời gian đào tạo: 3 năm (Niên chế)");
        System.out.println("Được nhận thưởng: " + (duocNhanThuong() ? "Có" : "Không"));
        System.out.println("===================================");
    }
}