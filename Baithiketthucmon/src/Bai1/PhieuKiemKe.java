package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhieuKiemKe {
    private String maPhieu;
    private String ngayKiemKe;
    private NhanVien nhanVienKiemKe;
    private PhongBan phongKiemKe;
    private List<TaiSan> danhSachTaiSan;
    
    public PhieuKiemKe() {
        danhSachTaiSan = new ArrayList<>();
    }
    
    public PhieuKiemKe(String maPhieu, String ngayKiemKe, NhanVien nhanVienKiemKe, PhongBan phongKiemKe) {
        this.maPhieu = maPhieu;
        this.ngayKiemKe = ngayKiemKe;
        this.nhanVienKiemKe = nhanVienKiemKe;
        this.phongKiemKe = phongKiemKe;
        danhSachTaiSan = new ArrayList<>();
    }
    
    // Getter và Setter
    public String getMaPhieu() {
        return maPhieu;
    }
    
    public void setMaPhieu(String maPhieu) {
        if (maPhieu == null || maPhieu.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã phiếu không được để trống");
        }
        this.maPhieu = maPhieu;
    }
    
    public String getNgayKiemKe() {
        return ngayKiemKe;
    }
    
    public void setNgayKiemKe(String ngayKiemKe) {
        if (ngayKiemKe == null || ngayKiemKe.trim().isEmpty()) {
            throw new IllegalArgumentException("Ngày kiểm kê không được để trống");
        }
        this.ngayKiemKe = ngayKiemKe;
    }
    
    public NhanVien getNhanVienKiemKe() {
        return nhanVienKiemKe;
    }
    
    public void setNhanVienKiemKe(NhanVien nhanVienKiemKe) {
        if (nhanVienKiemKe == null) {
            throw new IllegalArgumentException("Nhân viên kiểm kê không được null");
        }
        this.nhanVienKiemKe = nhanVienKiemKe;
    }
    
    public PhongBan getPhongKiemKe() {
        return phongKiemKe;
    }
    
    public void setPhongKiemKe(PhongBan phongKiemKe) {
        if (phongKiemKe == null) {
            throw new IllegalArgumentException("Phòng kiểm kê không được null");
        }
        this.phongKiemKe = phongKiemKe;
    }
    
    public List<TaiSan> getDanhSachTaiSan() {
        return danhSachTaiSan;
    }
    
    public void setDanhSachTaiSan(List<TaiSan> danhSachTaiSan) {
        if (danhSachTaiSan == null) {
            throw new IllegalArgumentException("Danh sách tài sản không được null");
        }
        this.danhSachTaiSan = danhSachTaiSan;
    }
    
    // Phương thức thêm tài sản
    public void themTaiSan(TaiSan taiSan) {
        if (taiSan == null) {
            throw new IllegalArgumentException("Tài sản không được null");
        }
        danhSachTaiSan.add(taiSan);
    }
    
    // Phương thức tính tổng số lượng
    public int tinhTongSoLuong() {
        int tong = 0;
        for (TaiSan ts : danhSachTaiSan) {
            tong += ts.getSoLuong();
        }
        return tong;
    }
    
    // Phương thức đếm số loại tài sản
    public int demSoLoaiTaiSan() {
        return danhSachTaiSan.size();
    }
    
    // Phương thức hiển thị phiếu
    public void hienThiPhieu() {
        System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                     PHIẾU KIỂM KÊ TÀI SẢN                         ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ Mã phiếu: " + maPhieu + "                                                   ║");
        System.out.println("║ Ngày kiểm kê: " + ngayKiemKe + "                                            ║");
        System.out.println("║ Nhân viên kiểm kê: " + nhanVienKiemKe.getTen() + "                              ║");
        System.out.println("║ Chức vụ: " + nhanVienKiemKe.getChucVu() + "                                  ║");
        System.out.println("║ Kiểm kê tại phòng: " + phongKiemKe.getTenPhong() + "                      ║");
        System.out.println("║ Mã phòng: " + phongKiemKe.getMaPhong() + "                                              ║");
        System.out.println("║ Trưởng phòng: " + phongKiemKe.getTenTruongPhong() + "                         ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                      DANH SÁCH TÀI SẢN                             ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ Tên tài sản                 Số lượng        Tình trạng             ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        
        for (TaiSan ts : danhSachTaiSan) {
            System.out.printf("║ %-25s %-15d %-20s ║\n", 
                ts.getTenTaiSan(), ts.getSoLuong(), ts.getTinhTrang());
        }
        
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ Số tài sản đã kiểm kê: %-2d.            Tổ số lượng: %-12d  ║\n", 
            demSoLoaiTaiSan(), tinhTongSoLuong());
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
    }
    
    // Nhập thông tin phiếu từ bàn phím
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        // Nhập mã phiếu
        while (true) {
            try {
                System.out.print("Nhập mã phiếu: ");
                String maPhieuInput = sc.nextLine();
                if (maPhieuInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Mã phiếu không được để trống!");
                    continue;
                }
                this.maPhieu = maPhieuInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        // Nhập ngày kiểm kê
        while (true) {
            try {
                System.out.print("Nhập ngày kiểm kê (dd/mm/yyyy): ");
                String ngayKiemKeInput = sc.nextLine();
                if (ngayKiemKeInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Ngày kiểm kê không được để trống!");
                    continue;
                }
                this.ngayKiemKe = ngayKiemKeInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        // Nhập thông tin nhân viên
        System.out.println("\n=== NHẬP THÔNG TIN NHÂN VIÊN KIỂM KÊ ===");
        nhanVienKiemKe = new NhanVien();
        nhanVienKiemKe.nhapThongTin();
        
        // Nhập thông tin phòng
        System.out.println("\n=== NHẬP THÔNG TIN PHÒNG KIỂM KÊ ===");
        phongKiemKe = new PhongBan();
        phongKiemKe.nhapThongTin();
        
        // Nhập danh sách tài sản
        System.out.println("\n=== NHẬP DANH SÁCH TÀI SẢN ===");
        while (true) {
            try {
                System.out.print("Nhập số lượng tài sản cần kiểm kê: ");
                int soLuongTaiSan = Integer.parseInt(sc.nextLine());
                if (soLuongTaiSan <= 0) {
                    System.out.println("Lỗi: Số lượng tài sản phải lớn hơn 0!");
                    continue;
                }
                
                for (int i = 0; i < soLuongTaiSan; i++) {
                    System.out.println("\n--- Nhập thông tin tài sản thứ " + (i + 1) + " ---");
                    TaiSan taiSan = new TaiSan();
                    taiSan.nhapThongTin();
                    themTaiSan(taiSan);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        System.out.println("\n✅ Đã nhập xong thông tin phiếu kiểm kê!");
    }
    
    @Override
    public String toString() {
        return "Phiếu " + maPhieu + " - Ngày " + ngayKiemKe + " - " + 
               nhanVienKiemKe.getTen() + " - " + phongKiemKe.getTenPhong() + 
               " - " + demSoLoaiTaiSan() + " loại - " + tinhTongSoLuong() + " cái";
    }
}