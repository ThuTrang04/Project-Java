package bai1;
import java.util.*;

public class Dieukien {

    Scanner input = new Scanner(System.in);

    // 1. Nhập danh sách sinh viên (có kiểm tra trùng mã)
    public void Nhapdanhsach_SV(ArrayList<Sinhvien> ds, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập sinh viên thứ " + (i + 1) + " ---");
            Sinhvien sv = new Sinhvien();

            //  Nhập mã sinh viên, kiểm tra trùng
            while (true) {
                System.out.print("Nhập mã sinh viên: ");
                String ma = input.nextLine();

                boolean trung = false;
                for (Sinhvien s : ds) {
                    if (s.MaSV.equalsIgnoreCase(ma)) { //equalsIgnoreCase: phương thức so sánh hai chuỗi
                        trung = true;
                        break;
                    }
                }

                if (trung) {
                    System.out.println("Mã sinh viên đã tồn tại, vui lòng nhập lại: ");
                } else {
                    sv.MaSV = ma;
                    break;
                }
            }

            //  Nhập họ tên và điểm
            System.out.print("Nhập họ tên sinh viên: ");
            sv.Hoten = input.nextLine();

            System.out.print("Nhập điểm thi: ");
            sv.Diem = input.nextFloat();
            input.nextLine(); // xóa bộ nhớ đệm

            // Thêm vào danh sách
            ds.add(sv);
        }
    }


    // 2. Xuất danh sách sinh viên theo xếp loại
    public void Xuatdanhsach_SV(ArrayList<Sinhvien> ds) {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            System.out.println("\n====== DANH SÁCH SINH VIÊN ======");
            for (int i = 0; i < ds.size(); i++) {
                System.out.println("Sinh viên thứ " + (i + 1) + ":");
                ds.get(i).XuatSV();
            }
        }
    }

    // 3. Kiểm tra giới tính
    public void kiemtragioitinh() {
        boolean check = true;
        String gioiTinh;
        System.out.print("Vui lòng nhập giới tính (nam/nu): ");
        gioiTinh = input.nextLine().toLowerCase();

        while (check) {
            if (gioiTinh.equals("nam")) {
                System.out.println("Giới tính: Nam");
                break;
            } else if (gioiTinh.equals("nu")) {
                System.out.println("Giới tính: Nữ");
                break;
            } else {
                System.out.print("Nhập lại (nam/nu): ");
                gioiTinh = input.nextLine().toLowerCase();
            }
        }
    }
    //
}
