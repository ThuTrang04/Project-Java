import java.util.Scanner;

public class BangDiemSinhVien {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String hoTen;
        String gioiTinh;
        int tuoi;
        String ngayThi;
        float diemThi;
        String xepLoai;

        // Nhập họ tên
        System.out.print("Enter your name: ");
        hoTen = input.nextLine();

        // Nhập giới tính (chỉ nam/nữ)
        System.out.print("Enter men/women: ");
        gioiTinh = input.nextLine().toLowerCase();

        while (!gioiTinh.equals("nam") && !gioiTinh.equals("nữ")) {
            System.out.println(" Giới tính không hợp lệ! Vui lòng nhập lại.");
            System.out.print("Nhập giới tính (nam/nữ): ");
            gioiTinh = input.nextLine().toLowerCase();
        }

        // Nhập tuổi (18 - 40)
        System.out.print("Nhập tuổi (18-40): ");
        tuoi = input.nextInt();

        while (tuoi < 18 || tuoi > 40) {
            System.out.println("❌ Tuổi không hợp lệ! Vui lòng nhập lại.");
            System.out.print("Nhập tuổi (18-40): ");
            tuoi = input.nextInt();
        }

        input.nextLine(); // clear buffer

        // Nhập ngày thi
        System.out.print("Nhập ngày thi: ");
        ngayThi = input.nextLine();

        // Nhập điểm thi (0 - 10)
        System.out.print("Nhập điểm thi (0-10): ");
        diemThi = input.nextFloat();

        while (diemThi < 0 || diemThi > 10) {
            System.out.println("❌ Điểm không hợp lệ! Vui lòng nhập lại.");
            System.out.print("Nhập điểm thi (0-10): ");
            diemThi = input.nextFloat();
        }

        // Xếp loại
        if (diemThi >= 8) {
            xepLoai = "Giỏi";
        } else if (diemThi >= 6.5) {
            xepLoai = "Khá";
        } else if (diemThi >= 5) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }

        // ✅ Xuất thông tin
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Ngày thi: " + ngayThi);
        System.out.println("Điểm thi: " + diemThi);
        System.out.println("Xếp loại: " + xepLoai);
    }
}
