package buoi8.baiso2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo một thực phẩm hợp lệ
        // (Năm, Tháng, Ngày)
        LocalDate ngaySX1 = LocalDate.of(2023, 10, 1);
        LocalDate ngayHH1 = LocalDate.of(2025, 10, 1);
        
        ThucPham tp1 = new ThucPham("TP01", "Gạo ST25", 250000, ngaySX1, ngayHH1);
        
        // 2. Tạo thực phẩm bị lỗi (Tên rỗng, Giá âm) để test code sửa lỗi
        LocalDate ngaySX2 = LocalDate.of(2023, 5, 20);
        LocalDate ngayHH2 = LocalDate.of(2024, 5, 20);
        
        ThucPham tp2 = new ThucPham("TP02", "", -5000, ngaySX2, ngayHH2);

        // 3. Tạo thực phẩm lỗi ngày tháng (Hết hạn lại trước ngày Sản xuất)
        LocalDate ngaySX3 = LocalDate.of(2023, 11, 20);
        LocalDate ngayHH3 = LocalDate.of(2023, 1, 1); // Sai logic
        
        ThucPham tp3 = new ThucPham("TP03", "Nước mắm", 50000, ngaySX3, ngayHH3);

        // --- IN KẾT QUẢ RA MÀN HÌNH ---
        System.out.println("DANH SÁCH THỰC PHẨM:");
        System.out.println("--------------------------------------------------");
        System.out.println(tp1.toString());
        System.out.println(tp2.toString());
        System.out.println(tp3.toString());
    }
}
