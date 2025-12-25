package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xulychucnang {
    private List<PhieuKiemKe> danhSachPhieu;
    private Scanner scanner;
    
    public Xulychucnang() {
        danhSachPhieu = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    // a. Thêm danh sách các đối tượng từ bàn phím
    public void nhapThongTinPhieu() {
        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("           NHẬP THÔNG TIN PHIẾU KIỂM KÊ");
        System.out.println("═══════════════════════════════════════════════════");
        
        PhieuKiemKe phieu = new PhieuKiemKe();
        phieu.nhapThongTin();
        
        danhSachPhieu.add(phieu);
        System.out.println("\n✅ Đã thêm phiếu thành công vào hệ thống!");
    }
    
    // b. Tìm và xuất báo cáo thông tin theo mẫu phiếu
    public void xuatBaoCao() {
        if (danhSachPhieu.isEmpty()) {
            System.out.println("\n⚠ Danh sách phiếu trống! Vui lòng nhập phiếu trước.");
            return;
        }
        
        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("           XUẤT BÁO CÁO PHIẾU KIỂM KÊ");
        System.out.println("═══════════════════════════════════════════════════");
        
        System.out.print("Nhập mã phiếu cần xuất báo cáo: ");
        String maPhieu = scanner.nextLine();
        
        boolean timThay = false;
        for (PhieuKiemKe phieu : danhSachPhieu) {
            if (phieu.getMaPhieu().equalsIgnoreCase(maPhieu)) {
                timThay = true;
                phieu.hienThiPhieu();
                break;
            }
        }
        
        if (!timThay) {
            System.out.println("❌ Không tìm thấy phiếu với mã: " + maPhieu);
        }
    }
    
    // Hiển thị tất cả phiếu
    public void hienThiTatCaPhieu() {
        if (danhSachPhieu.isEmpty()) {
            System.out.println("\n⚠ Danh sách phiếu trống! Vui lòng nhập phiếu trước.");
            return;
        }
        
        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("           DANH SÁCH TẤT CẢ PHIẾU KIỂM KÊ");
        System.out.println("═══════════════════════════════════════════════════");
        
        System.out.println("Tổng số phiếu: " + danhSachPhieu.size());
        System.out.println("\n┌──────┬────────────────┬────────────────┬────────────────┬────────────┬────────────┐");
        System.out.println("│ STT  │   Mã phiếu     │   Ngày KK      │   Nhân viên    │  Phòng     │ Tổng SL    │");
        System.out.println("├──────┼────────────────┼────────────────┼────────────────┼────────────┼────────────┤");
        
        int stt = 1;
        for (PhieuKiemKe phieu : danhSachPhieu) {
            System.out.printf("│ %-4d │ %-14s │ %-14s │ %-14s │ %-10s │ %-10d │\n",
                stt++, 
                phieu.getMaPhieu(),
                phieu.getNgayKiemKe(),
                phieu.getNhanVienKiemKe().getTen(),
                phieu.getPhongKiemKe().getTenPhong(),
                phieu.tinhTongSoLuong()
            );
        }
        
        System.out.println("└──────┴────────────────┴────────────────┴────────────────┴────────────┴────────────┘");
        
        // Tính tổng số lượng tất cả phiếu
        int tongTatCa = 0;
        for (PhieuKiemKe phieu : danhSachPhieu) {
            tongTatCa += phieu.tinhTongSoLuong();
        }
        System.out.println("📊 Tổng số lượng tất cả tài sản: " + tongTatCa);
    }
    
    // Tìm kiếm phiếu theo tên nhân viên
    public void timPhieuTheoNhanVien() {
        if (danhSachPhieu.isEmpty()) {
            System.out.println("\n⚠ Danh sách phiếu trống! Vui lòng nhập phiếu trước.");
            return;
        }
        
        System.out.print("\nNhập tên nhân viên cần tìm: ");
        String tenNV = scanner.nextLine();
        
        List<PhieuKiemKe> ketQua = new ArrayList<>();
        for (PhieuKiemKe phieu : danhSachPhieu) {
            if (phieu.getNhanVienKiemKe().getTen().toLowerCase().contains(tenNV.toLowerCase())) {
                ketQua.add(phieu);
            }
        }
        
        if (ketQua.isEmpty()) {
            System.out.println("❌ Không tìm thấy phiếu nào của nhân viên: " + tenNV);
        } else {
            System.out.println("\n✅ Tìm thấy " + ketQua.size() + " phiếu của nhân viên " + tenNV + ":");
            for (PhieuKiemKe phieu : ketQua) {
                System.out.println("  - " + phieu);
            }
        }
    }
    
    // Tìm kiếm phiếu theo tên phòng
    public void timPhieuTheoPhong() {
        if (danhSachPhieu.isEmpty()) {
            System.out.println("\n⚠ Danh sách phiếu trống! Vui lòng nhập phiếu trước.");
            return;
        }
        
        System.out.print("\nNhập tên phòng cần tìm: ");
        String tenPhong = scanner.nextLine();
        
        List<PhieuKiemKe> ketQua = new ArrayList<>();
        for (PhieuKiemKe phieu : danhSachPhieu) {
            if (phieu.getPhongKiemKe().getTenPhong().toLowerCase().contains(tenPhong.toLowerCase())) {
                ketQua.add(phieu);
            }
        }
        
        if (ketQua.isEmpty()) {
            System.out.println("❌ Không tìm thấy phiếu nào tại phòng: " + tenPhong);
        } else {
            System.out.println("\n✅ Tìm thấy " + ketQua.size() + " phiếu tại phòng " + tenPhong + ":");
            for (PhieuKiemKe phieu : ketQua) {
                System.out.println("  - " + phieu);
            }
        }
    }
    
    // Thống kê số lượng phiếu
    public void thongKe() {
        if (danhSachPhieu.isEmpty()) {
            System.out.println("\n⚠ Danh sách phiếu trống! Vui lòng nhập phiếu trước.");
            return;
        }
        
        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("                THỐNG KÊ HỆ THỐNG");
        System.out.println("═══════════════════════════════════════════════════");
        
        System.out.println("📋 Tổng số phiếu kiểm kê: " + danhSachPhieu.size());
        
        // Tính tổng số lượng tất cả tài sản
        int tongSoLuong = 0;
        int tongLoaiTaiSan = 0;
        for (PhieuKiemKe phieu : danhSachPhieu) {
            tongSoLuong += phieu.tinhTongSoLuong();
            tongLoaiTaiSan += phieu.demSoLoaiTaiSan();
        }
        
        System.out.println("📦 Tổng số lượng tất cả tài sản: " + tongSoLuong);
        System.out.println("🏷️  Tổng số loại tài sản: " + tongLoaiTaiSan);
        
        // Tìm phiếu có nhiều tài sản nhất
        if (!danhSachPhieu.isEmpty()) {
            PhieuKiemKe phieuNhieuNhat = danhSachPhieu.get(0);
            for (PhieuKiemKe phieu : danhSachPhieu) {
                if (phieu.tinhTongSoLuong() > phieuNhieuNhat.tinhTongSoLuong()) {
                    phieuNhieuNhat = phieu;
                }
            }
            System.out.println("🏆 Phiếu có nhiều tài sản nhất: " + phieuNhieuNhat.getMaPhieu() + 
                             " (" + phieuNhieuNhat.tinhTongSoLuong() + " cái)");
        }
    }
    
    // Tạo dữ liệu mẫu
    public void taoDuLieuMau() {
        // Tạo dữ liệu mẫu theo đề bài
        NhanVien nv1 = new NhanVien("Kiểu Thị Thanh", "Kế toán viên");
        PhongBan pb1 = new PhongBan("PTC", "Tổ chức hành chính", "Hoàng Bích Hảo");
        PhieuKiemKe phieu1 = new PhieuKiemKe("PH01", "1/1/2007", nv1, pb1);
        
        phieu1.themTaiSan(new TaiSan("Máy vi tính", 5, "Tốt"));
        phieu1.themTaiSan(new TaiSan("Máy vi tính", 3, "Hết khấu hao - hỏng"));
        phieu1.themTaiSan(new TaiSan("Bàn làm việc", 6, "Tốt"));
        
        // Thêm một số dữ liệu mẫu khác
        NhanVien nv2 = new NhanVien("Nguyễn Văn A", "Nhân viên IT");
        PhongBan pb2 = new PhongBan("IT", "Công nghệ thông tin", "Trần Thị B");
        PhieuKiemKe phieu2 = new PhieuKiemKe("PH02", "15/1/2007", nv2, pb2);
        
        phieu2.themTaiSan(new TaiSan("Máy in", 2, "Tốt"));
        phieu2.themTaiSan(new TaiSan("Máy chiếu", 1, "Bình thường"));
        phieu2.themTaiSan(new TaiSan("Máy tính xách tay", 4, "Tốt"));
        
        danhSachPhieu.add(phieu1);
        danhSachPhieu.add(phieu2);
        
        System.out.println("\n✅ Đã tạo dữ liệu mẫu thành công!");
        System.out.println("   - 2 phiếu kiểm kê đã được thêm vào hệ thống");
        System.out.println("   - Phiếu PH01: Dữ liệu theo đề bài");
        System.out.println("   - Phiếu PH02: Dữ liệu mẫu bổ sung");
    }
    
    // c. Xây dựng menu
    public void menu() {
        int luaChon;
        
        do {
            System.out.println("\n═══════════════════════════════════════════════════");
            System.out.println("    HỆ THỐNG QUẢN LÝ KIỂM KÊ TÀI SẢN");
            System.out.println("═══════════════════════════════════════════════════");
            System.out.println("1. Nhập thông tin phiếu kiểm kê");
            System.out.println("2. Xuất báo cáo theo mã phiếu");
            System.out.println("3. Hiển thị tất cả phiếu");
            System.out.println("4. Tìm phiếu theo nhân viên");
            System.out.println("5. Tìm phiếu theo phòng");
            System.out.println("6. Thống kê hệ thống");
            System.out.println("7. Tạo dữ liệu mẫu");
            System.out.println("8. Thoát chương trình");
            System.out.println("═══════════════════════════════════════════════════");
            System.out.print("Chọn chức năng (1-8): ");
            
            try {
                luaChon = Integer.parseInt(scanner.nextLine());
                
                switch (luaChon) {
                    case 1:
                        nhapThongTinPhieu();
                        break;
                    case 2:
                        xuatBaoCao();
                        break;
                    case 3:
                        hienThiTatCaPhieu();
                        break;
                    case 4:
                        timPhieuTheoNhanVien();
                        break;
                    case 5:
                        timPhieuTheoPhong();
                        break;
                    case 6:
                        thongKe();
                        break;
                    case 7:
                        taoDuLieuMau();
                        break;
                    case 8:
                        System.out.println("\n═══════════════════════════════════════════════════");
                        System.out.println("   Cảm ơn bạn đã sử dụng chương trình!");
                        System.out.println("   Chương trình kết thúc.");
                        System.out.println("═══════════════════════════════════════════════════");
                        break;
                    default:
                        System.out.println("⚠ Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠ Lỗi: Vui lòng nhập số từ 1 đến 8!");
                luaChon = 0;
            }
        } while (luaChon != 8);
    }
    
    // Getter
    public List<PhieuKiemKe> getDanhSachPhieu() {
        return danhSachPhieu;
    }
}