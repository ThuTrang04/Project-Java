package Bai1;
import java.util.Scanner;

// Lớp Main chứa menu chương trình
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySinhVien quanLy = new QuanLySinhVien();
        
        int luaChon;
        
        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn (1-8): ");
            
            try {
                luaChon = Integer.parseInt(scanner.nextLine());
                
                switch (luaChon) {
                    case 1:
                        quanLy.nhapThongTinSinhVien(scanner);
                        break;
                    case 2:
                        quanLy.xuatThongTinSinhVien();
                        break;
                    case 3:
                        quanLy.xuatThongTinSinhVienBang();
                        break;
                    case 4:
                        quanLy.sapXepTheoMa();
                        break;
                    case 5:
                        quanLy.thongKeSinhVien();
                        break;
                    case 6:
                        quanLy.timKiemTheoTen(scanner);
                        break;
                    case 7:
                        quanLy.danhSachSinhVienDuocThuong();
                        break;
                    case 8:
                        System.out.println("\nCảm ơn bạn đã sử dụng chương trình!");
                        System.out.println("Chương trình kết thúc.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
                }
                
                if (luaChon != 8) {
                    System.out.print("\nNhấn Enter để tiếp tục...");
                    scanner.nextLine();
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên từ 1 đến 8!");
                luaChon = 0;
            }
            
        } while (luaChon != 8);
        
        scanner.close();
    }
    
    private static void hienThiMenu() {
        System.out.println("\n=== CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN - ĐHCN ===");
        System.out.println("1. Nhập thông tin cụ thể cho 1 sinh viên");
        System.out.println("2. Xuất thông tin đầy đủ về sinh viên (chi tiết)");
        System.out.println("3. Xuất thông tin sinh viên dưới dạng bảng");
        System.out.println("4. Sắp xếp theo mã (riêng từng hệ)");
        System.out.println("5. Thống kê tổng số sinh viên (tất cả các hệ, riêng từng hệ)");
        System.out.println("6. Tìm kiếm theo Tên sinh viên");
        System.out.println("7. Danh sách sinh viên được nhận thưởng cuối khóa");
        System.out.println("8. Thoát chương trình");
        System.out.println("================================================");
    }
}