package Bai1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Lớp QuanLySinhVien
public class QuanLySinhVien {
    private List<SinhVienTrungCap> dsTrungCap;
    private List<SinhVienCaoDang> dsCaoDang;
    private List<SinhVienDaiHoc> dsDaiHoc;
    
    public QuanLySinhVien() {
        dsTrungCap = new ArrayList<>();
        dsCaoDang = new ArrayList<>();
        dsDaiHoc = new ArrayList<>();
        // KHÔNG khởi tạo dữ liệu mẫu
    }
    
    // 1. Nhập thông tin sinh viên
    public void nhapThongTinSinhVien(Scanner scanner) {
        System.out.println("\n=== NHẬP THÔNG TIN SINH VIÊN ===");
        System.out.println("Chọn hệ đào tạo:");
        System.out.println("1. Trung cấp");
        System.out.println("2. Cao đẳng");
        System.out.println("3. Đại học");
        System.out.print("Lựa chọn của bạn (1-3): ");
        
        int heDaoTao;
        try {
            heDaoTao = Integer.parseInt(scanner.nextLine());
            if (heDaoTao < 1 || heDaoTao > 3) {
                System.out.println("Lựa chọn không hợp lệ!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số!");
            return;
        }
        
        // Nhập mã sinh viên
        String maSV;
        while (true) {
            System.out.print("Nhập mã sinh viên: ");
            maSV = scanner.nextLine().trim().toUpperCase();
            
            if (maSV.isEmpty()) {
                System.out.println("Mã sinh viên không được để trống!");
                continue;
            }
            
            // Kiểm tra mã đã tồn tại chưa
            boolean daTonTai = kiemTraMaSVTonTai(maSV);
            if (daTonTai) {
                System.out.println("Mã sinh viên đã tồn tại! Vui lòng nhập mã khác.");
            } else {
                break;
            }
        }
        
        // Nhập họ tên
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        
        // Nhập giới tính (có rào lỗi)
        String gioiTinh;
        while (true) {
            System.out.print("Nhập giới tính (Nam/Nữ/Khác): ");
            gioiTinh = scanner.nextLine().trim();
            
            if (gioiTinh.equalsIgnoreCase("Nam") || 
                gioiTinh.equalsIgnoreCase("Nữ") || 
                gioiTinh.equalsIgnoreCase("Khác")) {
                break;
            } else {
                System.out.println("Giới tính không hợp lệ! Vui lòng nhập: Nam, Nữ hoặc Khác");
            }
        }
        
        // Nhập ngày sinh (có rào lỗi)
        Date ngaySinh = null;
        while (ngaySinh == null) {
            System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
            String ngaySinhStr = scanner.nextLine();
            
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                ngaySinh = sdf.parse(ngaySinhStr);
            } catch (ParseException e) {
                System.out.println("Ngày sinh không hợp lệ! Vui lòng nhập đúng định dạng dd/MM/yyyy");
            }
        }
        
        try {
            switch (heDaoTao) {
                case 1: // Trung cấp
                    double diemThiTC = nhapDiem(scanner, "điểm thi tốt nghiệp", 0, 10);
                    dsTrungCap.add(new SinhVienTrungCap(maSV, hoTen, gioiTinh, ngaySinh, diemThiTC));
                    System.out.println("Đã thêm sinh viên trung cấp thành công!");
                    break;
                    
                case 2: // Cao đẳng
                    double diemThiCD = nhapDiem(scanner, "điểm thi tốt nghiệp", 0, 10);
                    dsCaoDang.add(new SinhVienCaoDang(maSV, hoTen, gioiTinh, ngaySinh, diemThiCD));
                    System.out.println("Đã thêm sinh viên cao đẳng thành công!");
                    break;
                    
                case 3: // Đại học
                    int soTinChi;
                    while (true) {
                        System.out.print("Nhập số tín chỉ: ");
                        try {
                            soTinChi = Integer.parseInt(scanner.nextLine());
                            if (soTinChi > 0) {
                                break;
                            } else {
                                System.out.println("Số tín chỉ phải lớn hơn 0!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số nguyên!");
                        }
                    }
                    
                    System.out.print("Nhập tên đề tài tốt nghiệp: ");
                    String tenDeTai = scanner.nextLine();
                    
                    double diemDanhGia = nhapDiem(scanner, "điểm đánh giá", 0, 5);
                    
                    dsDaiHoc.add(new SinhVienDaiHoc(maSV, hoTen, gioiTinh, ngaySinh, soTinChi, tenDeTai, diemDanhGia));
                    System.out.println("Đã thêm sinh viên đại học thành công!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra khi nhập thông tin");
        }
    }
    
    // Kiểm tra mã sinh viên đã tồn tại chưa
    private boolean kiemTraMaSVTonTai(String maSV) {
        // Kiểm tra trong danh sách trung cấp
        for (SinhVienTrungCap sv : dsTrungCap) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return true;
            }
        }
        
        // Kiểm tra trong danh sách cao đẳng
        for (SinhVienCaoDang sv : dsCaoDang) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return true;
            }
        }
        
        // Kiểm tra trong danh sách đại học
        for (SinhVienDaiHoc sv : dsDaiHoc) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Phương thức nhập điểm với validation
    private double nhapDiem(Scanner scanner, String loaiDiem, double min, double max) {
        double diem;
        while (true) {
            System.out.print("Nhập " + loaiDiem + " (thang điểm " + min + " - " + max + "): ");
            try {
                diem = Double.parseDouble(scanner.nextLine());
                if (diem >= min && diem <= max) {
                    return diem;
                } else {
                    System.out.println(loaiDiem + " phải nằm trong khoảng " + min + " đến " + max + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }
    
    // 2. Xuất thông tin sinh viên (chi tiết)
    public void xuatThongTinSinhVien() {
        System.out.println("\n=== DANH SÁCH SINH VIÊN (CHI TIẾT) ===");
        
        int tongSo = dsTrungCap.size() + dsCaoDang.size() + dsDaiHoc.size();
        if (tongSo == 0) {
            System.out.println("Không có sinh viên nào trong danh sách!");
            return;
        }
        
        // Hiển thị sinh viên trung cấp
        if (!dsTrungCap.isEmpty()) {
            System.out.println("\n--- SINH VIÊN TRUNG CẤP ---");
            int stt = 1;
            for (SinhVienTrungCap sv : dsTrungCap) {
                System.out.println("\n--- Sinh viên thứ " + stt + " ---");
                sv.hienThiToanBoThongTin();
                stt++;
            }
        }
        
        // Hiển thị sinh viên cao đẳng
        if (!dsCaoDang.isEmpty()) {
            System.out.println("\n--- SINH VIÊN CAO ĐẲNG ---");
            int stt = 1;
            for (SinhVienCaoDang sv : dsCaoDang) {
                System.out.println("\n--- Sinh viên thứ " + stt + " ---");
                sv.hienThiToanBoThongTin();
                stt++;
            }
        }
        
        // Hiển thị sinh viên đại học
        if (!dsDaiHoc.isEmpty()) {
            System.out.println("\n--- SINH VIÊN ĐẠI HỌC ---");
            int stt = 1;
            for (SinhVienDaiHoc sv : dsDaiHoc) {
                System.out.println("\n--- Sinh viên thứ " + stt + " ---");
                sv.hienThiToanBoThongTin();
                stt++;
            }
        }
        
        System.out.println("\nTổng số sinh viên: " + tongSo);
    }
    
    // 2b. Xuất thông tin sinh viên dưới dạng bảng
    public void xuatThongTinSinhVienBang() {
        System.out.println("\n=== DANH SÁCH SINH VIÊN (DẠNG BẢNG) ===");
        
        int tongSo = dsTrungCap.size() + dsCaoDang.size() + dsDaiHoc.size();
        if (tongSo == 0) {
            System.out.println("Không có sinh viên nào trong danh sách!");
            return;
        }
        
        // Hiển thị sinh viên trung cấp
        if (!dsTrungCap.isEmpty()) {
            System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                    DANH SÁCH SINH VIÊN TRUNG CẤP                                    ║");
            System.out.println("╠══════════╦══════════════════════════╦══════════╦══════════════╦══════════════════╦══════════╦════════╣");
            System.out.println("║   Mã SV  ║         Họ tên           ║ Giới tính║  Ngày sinh   ║  Điểm thi TN     ║ Xếp loại ║ Thưởng ║");
            System.out.println("╠══════════╬══════════════════════════╬══════════╬══════════════╬══════════════════╬══════════╬════════╣");
            
            for (SinhVienTrungCap sv : dsTrungCap) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String ngaySinhStr = sdf.format(sv.getNgaySinh());
                
                System.out.printf("║ %-8s ║ %-24s ║ %-8s ║ %-12s ║ %-16.2f ║ %-8s ║ %-6s ║\n",
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getGioiTinh(),
                    ngaySinhStr,
                    sv.getDiemThiTotNghiep(),
                    sv.getXepLoai(),
                    sv.duocNhanThuong() ? "Có" : "Không");
            }
            System.out.println("╚══════════╩══════════════════════════╩══════════╩══════════════╩══════════════════╩══════════╩════════╝");
            System.out.println("Số lượng: " + dsTrungCap.size() + " sinh viên");
        }
        
        // Hiển thị sinh viên cao đẳng
        if (!dsCaoDang.isEmpty()) {
            System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                    DANH SÁCH SINH VIÊN CAO ĐẲNG                                    ║");
            System.out.println("╠══════════╦══════════════════════════╦══════════╦══════════════╦══════════════════╦══════════╦════════╣");
            System.out.println("║   Mã SV  ║         Họ tên           ║ Giới tính║  Ngày sinh   ║  Điểm thi TN     ║ Xếp loại ║ Thưởng ║");
            System.out.println("╠══════════╬══════════════════════════╬══════════╬══════════════╬══════════════════╬══════════╬════════╣");
            
            for (SinhVienCaoDang sv : dsCaoDang) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String ngaySinhStr = sdf.format(sv.getNgaySinh());
                
                System.out.printf("║ %-8s ║ %-24s ║ %-8s ║ %-12s ║ %-16.2f ║ %-8s ║ %-6s ║\n",
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getGioiTinh(),
                    ngaySinhStr,
                    sv.getDiemThiTotNghiep(),
                    sv.getXepLoai(),
                    sv.duocNhanThuong() ? "Có" : "Không");
            }
            System.out.println("╚══════════╩══════════════════════════╩══════════╩══════════════╩══════════════════╩══════════╩════════╝");
            System.out.println("Số lượng: " + dsCaoDang.size() + " sinh viên");
        }
        
        // Hiển thị sinh viên đại học
        if (!dsDaiHoc.isEmpty()) {
            System.out.println("\n╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                                   DANH SÁCH SINH VIÊN ĐẠI HỌC                                                                  ║");
            System.out.println("╠══════════╦══════════════════════════╦══════════╦══════════════╦══════════╦═══════════════════════════════════════════╦══════════════════╦══════════╦════════╣");
            System.out.println("║   Mã SV  ║         Họ tên           ║ Giới tính║  Ngày sinh   ║ Tín chỉ  ║           Đề tài tốt nghiệp                ║  Điểm đánh giá   ║ Xếp loại ║ Thưởng ║");
            System.out.println("╠══════════╬══════════════════════════╬══════════╬══════════════╬══════════╬═══════════════════════════════════════════╬══════════════════╬══════════╬════════╣");
            
            for (SinhVienDaiHoc sv : dsDaiHoc) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String ngaySinhStr = sdf.format(sv.getNgaySinh());
                String tenDeTai = sv.getTenDeTai();
                
                // Cắt ngắn đề tài nếu quá dài
                if (tenDeTai.length() > 35) {
                    tenDeTai = tenDeTai.substring(0, 32) + "...";
                }
                
                System.out.printf("║ %-8s ║ %-24s ║ %-8s ║ %-12s ║ %-8d ║ %-35s ║ %-16.2f ║ %-8s ║ %-6s ║\n",
                    sv.getMaSV(),
                    sv.getHoTen(),
                    sv.getGioiTinh(),
                    ngaySinhStr,
                    sv.getSoTinChi(),
                    tenDeTai,
                    sv.getDiemDanhGia(),
                    sv.getXepLoai(),
                    sv.duocNhanThuong() ? "Có" : "Không");
            }
            System.out.println("╚══════════╩══════════════════════════╩══════════╩══════════════╩══════════╩═══════════════════════════════════════════╩══════════════════╩══════════╩════════╝");
            System.out.println("Số lượng: " + dsDaiHoc.size() + " sinh viên");
        }
        
        System.out.println("\n══════════════════════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("TỔNG SỐ SINH VIÊN: " + tongSo + " (Trung cấp: " + dsTrungCap.size() + 
                          ", Cao đẳng: " + dsCaoDang.size() + ", Đại học: " + dsDaiHoc.size() + ")");
    }
    
    // 3. Sắp xếp theo mã (riêng từng hệ)
    public void sapXepTheoMa() {
        // Kiểm tra nếu không có sinh viên
        int tongSo = dsTrungCap.size() + dsCaoDang.size() + dsDaiHoc.size();
        if (tongSo == 0) {
            System.out.println("\nKhông có sinh viên để sắp xếp!");
            return;
        }
        
        // Sắp xếp sinh viên trung cấp
        if (!dsTrungCap.isEmpty()) {
            Collections.sort(dsTrungCap, new Comparator<SinhVienTrungCap>() {
                @Override
                public int compare(SinhVienTrungCap sv1, SinhVienTrungCap sv2) {
                    return sv1.getMaSV().compareTo(sv2.getMaSV());
                }
            });
        }
        
        // Sắp xếp sinh viên cao đẳng
        if (!dsCaoDang.isEmpty()) {
            Collections.sort(dsCaoDang, new Comparator<SinhVienCaoDang>() {
                @Override
                public int compare(SinhVienCaoDang sv1, SinhVienCaoDang sv2) {
                    return sv1.getMaSV().compareTo(sv2.getMaSV());
                }
            });
        }
        
        // Sắp xếp sinh viên đại học
        if (!dsDaiHoc.isEmpty()) {
            Collections.sort(dsDaiHoc, new Comparator<SinhVienDaiHoc>() {
                @Override
                public int compare(SinhVienDaiHoc sv1, SinhVienDaiHoc sv2) {
                    return sv1.getMaSV().compareTo(sv2.getMaSV());
                }
            });
        }
        
        System.out.println("\n=== DANH SÁCH SINH VIÊN ĐÃ SẮP XẾP THEO MÃ ===");
        
        // Hiển thị danh sách đã sắp xếp
        if (!dsTrungCap.isEmpty()) {
            System.out.println("\n--- SINH VIÊN TRUNG CẤP ---");
            for (SinhVienTrungCap sv : dsTrungCap) {
                System.out.println("Mã: " + sv.getMaSV() + " - Họ tên: " + sv.getHoTen());
            }
        }
        
        if (!dsCaoDang.isEmpty()) {
            System.out.println("\n--- SINH VIÊN CAO ĐẲNG ---");
            for (SinhVienCaoDang sv : dsCaoDang) {
                System.out.println("Mã: " + sv.getMaSV() + " - Họ tên: " + sv.getHoTen());
            }
        }
        
        if (!dsDaiHoc.isEmpty()) {
            System.out.println("\n--- SINH VIÊN ĐẠI HỌC ---");
            for (SinhVienDaiHoc sv : dsDaiHoc) {
                System.out.println("Mã: " + sv.getMaSV() + " - Họ tên: " + sv.getHoTen());
            }
        }
        
        System.out.println("\nĐã sắp xếp danh sách sinh viên theo mã thành công!");
    }
    
    // 4. Thống kê tổng số sinh viên
    public void thongKeSinhVien() {
        int soTrungCap = dsTrungCap.size();
        int soCaoDang = dsCaoDang.size();
        int soDaiHoc = dsDaiHoc.size();
        int tongSo = soTrungCap + soCaoDang + soDaiHoc;
        
        System.out.println("\n=== THỐNG KÊ SINH VIÊN ===");
        System.out.println("Tổng số sinh viên toàn trường: " + tongSo);
        System.out.println("Số sinh viên Trung cấp: " + soTrungCap);
        System.out.println("Số sinh viên Cao đẳng: " + soCaoDang);
        System.out.println("Số sinh viên Đại học: " + soDaiHoc);
        
//        if (tongSo > 0) {
//            System.out.println("\nTỷ lệ phần trăm:");
//            System.out.printf("Trung cấp: %.2f%%\n", (soTrungCap * 100.0 / tongSo));
//            System.out.printf("Cao đẳng: %.2f%%\n", (soCaoDang * 100.0 / tongSo));
//            System.out.printf("Đại học: %.2f%%\n", (soDaiHoc * 100.0 / tongSo));
//        } else {
//            System.out.println("\nChưa có sinh viên nào trong hệ thống!");
//        }
    }
    
    // 5. Tìm kiếm theo tên sinh viên
    public void timKiemTheoTen(Scanner scanner) {
        int tongSo = dsTrungCap.size() + dsCaoDang.size() + dsDaiHoc.size();
        if (tongSo == 0) {
            System.out.println("\nKhông có sinh viên để tìm kiếm!");
            return;
        }
        
        System.out.print("\nNhập tên sinh viên cần tìm: ");
        String tenCanTim = scanner.nextLine().trim().toLowerCase();
        
        List<Object> ketQua = new ArrayList<>();
        
        // Tìm trong sinh viên trung cấp
        for (SinhVienTrungCap sv : dsTrungCap) {
            if (sv.getHoTen().toLowerCase().contains(tenCanTim)) {
                ketQua.add(sv);
            }
        }
        
        // Tìm trong sinh viên cao đẳng
        for (SinhVienCaoDang sv : dsCaoDang) {
            if (sv.getHoTen().toLowerCase().contains(tenCanTim)) {
                ketQua.add(sv);
            }
        }
        
        // Tìm trong sinh viên đại học
        for (SinhVienDaiHoc sv : dsDaiHoc) {
            if (sv.getHoTen().toLowerCase().contains(tenCanTim)) {
                ketQua.add(sv);
            }
        }
        
        if (ketQua.isEmpty()) {
            System.out.println("Không tìm thấy sinh viên có tên chứa \"" + tenCanTim + "\"");
        } else {
            System.out.println("\n=== KẾT QUẢ TÌM KIẾM ===");
            System.out.println("Tìm thấy " + ketQua.size() + " sinh viên:");
            
            int stt = 1;
            for (Object obj : ketQua) {
                System.out.println("\n--- Kết quả " + stt + " ---");
                
                if (obj instanceof SinhVienTrungCap) {
                    ((SinhVienTrungCap) obj).hienThiToanBoThongTin();
                } else if (obj instanceof SinhVienCaoDang) {
                    ((SinhVienCaoDang) obj).hienThiToanBoThongTin();
                } else if (obj instanceof SinhVienDaiHoc) {
                    ((SinhVienDaiHoc) obj).hienThiToanBoThongTin();
                }
                
                stt++;
            }
        }
    }
    
    // 6. Danh sách sinh viên được nhận thưởng
    public void danhSachSinhVienDuocThuong() {
        List<Object> dsDuocThuong = new ArrayList<>();
        
        // Kiểm tra sinh viên trung cấp
        for (SinhVienTrungCap sv : dsTrungCap) {
            if (sv.duocNhanThuong()) {
                dsDuocThuong.add(sv);
            }
        }
        
        // Kiểm tra sinh viên cao đẳng
        for (SinhVienCaoDang sv : dsCaoDang) {
            if (sv.duocNhanThuong()) {
                dsDuocThuong.add(sv);
            }
        }
        
        // Kiểm tra sinh viên đại học
        for (SinhVienDaiHoc sv : dsDaiHoc) {
            if (sv.duocNhanThuong()) {
                dsDuocThuong.add(sv);
            }
        }
        
        if (dsDuocThuong.isEmpty()) {
            System.out.println("\nKhông có sinh viên nào được nhận thưởng cuối khóa!");
            return;
        }
        
        System.out.println("\n=== DANH SÁCH SINH VIÊN ĐƯỢC NHẬN THƯỞNG CUỐI KHÓA ===");
        System.out.println("(Đại học: xếp loại A, Trung cấp/Cao đẳng: xếp loại Giỏi)");
        
        int stt = 1;
        for (Object obj : dsDuocThuong) {
            System.out.println("\n--- Sinh viên thứ " + stt + " ---");
            
            if (obj instanceof SinhVienTrungCap) {
                ((SinhVienTrungCap) obj).hienThiToanBoThongTin();
            } else if (obj instanceof SinhVienCaoDang) {
                ((SinhVienCaoDang) obj).hienThiToanBoThongTin();
            } else if (obj instanceof SinhVienDaiHoc) {
                ((SinhVienDaiHoc) obj).hienThiToanBoThongTin();
            }
            
            stt++;
        }
        
        System.out.println("\nTổng số sinh viên được nhận thưởng: " + dsDuocThuong.size());
    }
}