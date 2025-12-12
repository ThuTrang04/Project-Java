package Bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Xuly ql = new Xuly();                       // đối tượng quản lý duy nhất
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int chon = -1; // khai báo và khởi tạo trước vòng lặp

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập sách giáo khoa");
            System.out.println("2. Nhập sách tham khảo");
            System.out.println("3. Xuất tất cả sách");
            System.out.println("4. Tổng tiền SGK");
            System.out.println("5. Tổng tiền STK");
            System.out.println("6. TB đơn giá STK");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                // nếu người dùng chỉ enter → tiếp tục vòng lặp (không crash)
                continue;
            }

            try {
                chon = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ (0-6).");
                continue;
            }

            switch (chon) {
                case 1: {
                    try {
                        System.out.print("Mã sách: ");
                        String ma = sc.nextLine();

                        System.out.print("Ngày nhập (dd/MM/yyyy): ");
                        LocalDate ngay = LocalDate.parse(sc.nextLine(), fmt);

                        System.out.print("Đơn giá: ");
                        double dg = Double.parseDouble(sc.nextLine());

                        System.out.print("Số lượng: ");
                        int sl = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhà xuất bản: ");
                        String nxb = sc.nextLine();

                        System.out.print("Tình trạng (1 = mới, 0 = cũ): ");
                        String tt = sc.nextLine().trim();
                        boolean tinhTrang = tt.equals("1");

                        Sach_giao_khoa sgk = new Sach_giao_khoa(ma, ngay, dg, sl, nxb, tinhTrang);
                        ql.themSach(sgk);
                        System.out.println("Đã thêm SGK.");
                    } catch (DateTimeParseException dtp) {
                        System.out.println("Định dạng ngày sai. Hãy nhập theo dd/MM/yyyy.");
                    } catch (NumberFormatException nf) {
                        System.out.println("Định dạng số sai. Hãy kiểm tra đơn giá / số lượng.");
                    }
                    break;
                }

                case 2: {
                    try {
                        System.out.print("Mã sách: ");
                        String ma = sc.nextLine();

                        System.out.print("Ngày nhập (dd/MM/yyyy): ");
                        LocalDate ngay = LocalDate.parse(sc.nextLine(), fmt);

                        System.out.print("Đơn giá: ");
                        double dg = Double.parseDouble(sc.nextLine());

                        System.out.print("Số lượng: ");
                        int sl = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhà xuất bản: ");
                        String nxb = sc.nextLine();

                        System.out.print("Thuế: ");
                        double thue = Double.parseDouble(sc.nextLine());

                        Sach_tham_khao stk = new Sach_tham_khao(ma, ngay, dg, sl, nxb, thue);
                        ql.themSach(stk);
                        System.out.println("Đã thêm STK.");
                    } catch (DateTimeParseException dtp) {
                        System.out.println("Định dạng ngày sai. Hãy nhập theo dd/MM/yyyy.");
                    } catch (NumberFormatException nf) {
                        System.out.println("Định dạng số sai. Hãy kiểm tra đơn giá / số lượng / thuế.");
                    }
                    break;
                }

                case 3:
                    System.out.println("=== DANH SÁCH SÁCH ===");
                    ql.xuatToanBo();
                    break;

                case 4:
                    System.out.println("Tổng tiền SGK: " + ql.tongSGK());
                    break;

                case 5:
                    System.out.println("Tổng tiền STK: " + ql.tongSTK());
                    break;

                case 6:
                    System.out.println("Trung bình đơn giá STK: " + ql.TBdonGiaSTK());
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập số từ 0 đến 6.");
            }

        } while (chon != 0);

        sc.close();
    }
}
