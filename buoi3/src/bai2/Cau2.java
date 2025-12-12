package bai2;
import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        xuly xl = new xuly();
        
        while (true) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║         MENU QUẢN LÝ MẢNG             ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1. Nhập mảng số nguyên                ║");
            System.out.println("║ 2. Xuất mảng số nguyên                ║");
            System.out.println("║ 3. Sắp xếp mảng giảm dần              ║");
            System.out.println("║ 4. Chèn phần tử vào mảng              ║");
            System.out.println("║ 5. Trộn 2 mảng                        ║");
            System.out.println("║ 6. Tìm phần tử lớn hơn trung bình     ║");
            System.out.println("║ 0. Thoát chương trình                 ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Chọn chức năng: ");
            
            int chon = xuly.nhapSoNguyen(sc);
            
            if (chon == 0) {
                System.out.println("\n✓ Kết thúc chương trình. Tạm biệt!");
                break;
            }
            
            switch (chon) {
                case 1:
                    xl.nhapMang(sc);
                    break;
                case 2:
                    xl.xuatMang();
                    break;
                case 3:
                    xl.sapXepGiamDan();
                    break;
                case 4:
                    xl.chenPhanTu(sc);
                    break;
                case 5:
                    xl.tronHaiMang(sc);
                    break;
                case 6:
                    xl.timLonHonTrungBinh();
                    break;
                default:
                    System.out.println("✗ Lựa chọn không hợp lệ! Vui lòng chọn từ 0-6.");
            }
        }
        
        sc.close();
    }
}
