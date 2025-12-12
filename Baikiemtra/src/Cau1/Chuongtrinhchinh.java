package Cau1;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuongtrinhchinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CD> ds = new ArrayList<>();
        Xuly xl = new Xuly();

        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ CD =====");
            System.out.println("1. Thêm CD");
            System.out.println("2. Xuất toàn bộ danh sách");
            System.out.println("3. Đếm số lượng CD");
            System.out.println("4. Tính tổng giá thành");
            System.out.println("5. Sắp xếp theo tựa CD");
            System.out.println("6. Tìm kiếm theo ca sỹ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = input.nextInt();

            switch (chon) {
                case 1:
                    xl.ThemCD(ds);
                    break;
                case 2:
                    xl.XuatDanhSach(ds);
                    break;
                case 3:
                    xl.DemSoLuong(ds);
                    break;
                case 4:
                    xl.TongGia(ds);
                    break;
                case 5:
                    xl.SapXepTheoTua(ds);
                    break;
                case 6:
                    xl.TimTheoCaSy(ds);
                    break;
                case 0:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
