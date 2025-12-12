package bai1;
import java.util.*;

public class Chuongtrinhchinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dieukien dk = new Dieukien();
        ArrayList<Sinhvien> ds = new ArrayList<>();

        int chon;
        do {
            System.out.println("\n========== MENU QUẢN LÝ SINH VIÊN ==========");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3.Kiểm tra giới tính");
            System.out.println("4. Xếp loại học lực sinh viên: Giỏi, khá, trung bình, yếu.");
            System.out.println("5. Tìm và xuất danh sách sinh viên theo xếp loại. Ví dụ: nhập Giỏi =&gt; xuất danh sách sv Giỏi.");
            
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); // Xóa bộ nhớ đệm

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên muốn thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    dk.Nhapdanhsach_SV(ds, n);
                    break;
                case 2:
                    dk.Xuatdanhsach_SV(ds);
                    break;
             
                case 3:
                    dk.kiemtragioitinh();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (chon != 0);
    }
}
