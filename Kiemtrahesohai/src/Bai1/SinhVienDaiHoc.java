package Bai1;
import java.util.Date;

// Lớp SinhVienDaiHoc kế thừa từ SinhVien
public class SinhVienDaiHoc extends SinhVien {
    private int soTinChi;
    private String tenDeTai;
    private double diemDanhGia;
    private String xepLoai;
    
    public SinhVienDaiHoc() {
        super();
    }
    
    public SinhVienDaiHoc(String maSV, String hoTen, String gioiTinh, Date ngaySinh, 
                          int soTinChi, String tenDeTai, double diemDanhGia) {
        super(maSV, hoTen, gioiTinh, ngaySinh);
        this.soTinChi = soTinChi;
        this.tenDeTai = tenDeTai;
        this.diemDanhGia = diemDanhGia;
        this.xepLoai = tinhXepLoai();
    }
    
    public int getSoTinChi() {
        return soTinChi;
    }
    
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
    public String getTenDeTai() {
        return tenDeTai;
    }
    
    public void setTenDeTai(String tenDeTai) {
        this.tenDeTai = tenDeTai;
    }
    
    public double getDiemDanhGia() {
        return diemDanhGia;
    }
    
    public void setDiemDanhGia(double diemDanhGia) {
        this.diemDanhGia = diemDanhGia;
        this.xepLoai = tinhXepLoai();
    }
    
    public String getXepLoai() {
        return xepLoai;
    }
    
    // Tính xếp loại dựa trên điểm đánh giá (thang điểm 5)
    private String tinhXepLoai() {
        if (diemDanhGia >= 4.5) {
            return "A";
        } else if (diemDanhGia >= 3.5) {
            return "B";
        } else if (diemDanhGia >= 2.5) {
            return "C";
        } else {
            return "D";
        }
    }
    
    // Kiểm tra được nhận thưởng
    public boolean duocNhanThuong() {
        return xepLoai.equals("A");
    }
    
    // Hiển thị toàn bộ thông tin
    public void hienThiToanBoThongTin() {
        System.out.println("=== THÔNG TIN SINH VIÊN ĐẠI HỌC ===");
        hienThiThongTin();
        System.out.println("Số tín chỉ: " + soTinChi);
        System.out.println("Đề tài tốt nghiệp: " + tenDeTai);
        System.out.println("Điểm đánh giá: " + diemDanhGia);
        System.out.println("Xếp loại: " + xepLoai);
        System.out.println("Được nhận thưởng: " + (duocNhanThuong() ? "Có" : "Không"));
        System.out.println("===================================");
    }
}