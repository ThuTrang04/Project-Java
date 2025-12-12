package buoi8.baiso2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThucPham {
    // Khai báo các thuộc tính (viết đầy đủ, không viết tắt)
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    // Constructor 1: Chỉ có mã hàng (các cái khác tự đặt mặc định)
    public ThucPham(String maHang) {
        // Kiểm tra mã hàng ngay khi tạo
        if (maHang != null && !maHang.isEmpty()) {
            this.maHang = maHang;
        } else {
            System.out.println("Mã hàng không được để trống.");
            this.maHang = "M000";
        }
        
        // Gán giá trị mặc định cho các thuộc tính còn lại
        this.tenHang = "xxx";
        this.donGia = 1;
        this.ngaySanXuat = LocalDate.now(); // Ngày hiện tại
        this.ngayHetHan = LocalDate.now();  // Ngày hiện tại
    }

    // Constructor 2: Đầy đủ tham số
    public ThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        // 1. Xử lý Mã Hàng (chỉ set 1 lần ở đây, không có hàm setMaaHang)
        if (maHang != null && !maHang.isEmpty()) {
            this.maHang = maHang;
        } else {
            System.out.println("Mã hàng lỗi. Đã gán 'M000'");
            this.maHang = "M000";
        }

        // 2. Các thuộc tính khác gọi hàm set để kiểm tra lỗi luôn
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySanXuat(ngaySanXuat);
        this.setNgayHetHan(ngayHetHan);
    }

    // --- CÁC HÀM GET (Lấy dữ liệu) VÀ SET (Gán dữ liệu) ---

    public String getMaHang() {
        return maHang;
    }
    // Không viết setMaHang vì đề bài cấm sửa mã hàng

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null && !tenHang.isEmpty()) {
            this.tenHang = tenHang;
        } else {
            System.out.println("Tên hàng rỗng. Đã gán là 'xxx'");
            this.tenHang = "xxx";
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Đơn giá phải > 0. Đã gán là 1");
            this.donGia = 1;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat != null) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            System.out.println("Ngày SX rỗng. Đã gán ngày hiện tại.");
            this.ngaySanXuat = LocalDate.now();
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan != null) {
            // Kiểm tra: Ngày hết hạn phải SAU ngày sản xuất
            if (ngayHetHan.isAfter(this.ngaySanXuat)) {
                this.ngayHetHan = ngayHetHan;
            } else {
                System.out.println("Ngày hết hạn phải sau ngày SX. Đã gán bằng ngày SX.");
                this.ngayHetHan = this.ngaySanXuat;
            }
        } else {
            System.out.println("Ngày hết hạn rỗng. Đã gán bằng ngày SX.");
            this.ngayHetHan = this.ngaySanXuat;
        }
    }

    // --- CÁC HÀM XỬ LÝ NGHIỆP VỤ ---

    // Lấy chuỗi trạng thái đã hết hạn hay chưa
    public String layTrangThaiHSD() {
        LocalDate homNay = LocalDate.now();
        if (this.ngayHetHan.isBefore(homNay)) {
            return "Đã hết hạn";
        } else {
            return "Còn hạn";
        }
    }

    // Hàm toString để in thông tin ra màn hình đẹp hơn
    @Override
    public String toString() {
        // Định dạng tiền: thêm dấu phẩy (Ví dụ: 10,000)
        DecimalFormat dinhDangTien = new DecimalFormat("#,###");
        
        // Định dạng ngày: dd/MM/yyyy
        DateTimeFormatter dinhDangNgay = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Trả về chuỗi thông tin
        return maHang + " - " + tenHang + " - " + dinhDangTien.format(donGia) + " VNĐ - " + ngaySanXuat.format(dinhDangNgay) + " - " + ngayHetHan.format(dinhDangNgay) + " - " + layTrangThaiHSD();
    }
}
