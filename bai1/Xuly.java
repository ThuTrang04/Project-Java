package buoi13.bai1;

import java.util.ArrayList;

import Library.Library;

public class Xuly {
    ArrayList<Sach> listSach = new ArrayList<>();

    public void nhapSach() {
        System.out.println("1. Nhap Sach Giao Khoa");
        System.out.println("2. Nhap Sach Tham Khao");
        int chon = Library.getInt("Chon loai sach: ");

        String ma = Library.getString("Nhap ma sach: ", true);
        String ngay = Library.getString("Nhap ngay nhap (ngay/thang/nam): ", true);
        double gia = Library.getDouble("Nhap don gia: ");
        int sl = Library.getInt("Nhap so luong: ");
        String nxb = Library.getString("Nhap NXB: ", true);

        if (chon == 1) {
            String tinhTrang = Library.getString("Nhap tinh trang (moi/cu): ", true);
            SachGiaoKhoa sgk = new SachGiaoKhoa(ma, ngay, gia, sl, nxb, tinhTrang);
            listSach.add(sgk);
        } else if (chon == 2) {
            double thue = Library.getDouble("Nhap thue: ");
            SachThamKhao stk = new SachThamKhao(ma, ngay, gia, sl, nxb, thue);
            listSach.add(stk);
        }
    }

    public void xuatDanhSach() {
        System.out.println("--- DANH SACH SACH ---");
        for (Sach s : listSach) {
            System.out.println(s.toString());
        }
    }

    public void tongTienTungLoai() {
        double tongSGK = 0;
        double tongSTK = 0;
        for (Sach s : listSach) {
            if (s instanceof SachGiaoKhoa) {
                tongSGK += s.thanhTien();
            } else if (s instanceof SachThamKhao) {
                tongSTK += s.thanhTien();
            }
        }
        System.out.println("Tong tien Sach Giao Khoa: " + tongSGK);
        System.out.println("Tong tien Sach Tham Khao: " + tongSTK);
    }

    public void trungBinhDonGiaSTK() {
        double tongDonGia = 0;
        int dem = 0;
        for (Sach s : listSach) {
            if (s instanceof SachThamKhao) {
                tongDonGia += s.donGia;
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("Khong co sach tham khao.");
        else
            System.out.println("Trung binh don gia Sach Tham Khao: " + (tongDonGia / dem));
    }

    public void timSachTheoNXB() {
        String nxbCanTim = Library.getString("Nhap ten NXB muon tim (vidu: Kim Dong): ", true);
        System.out.println("Cac sach giao khoa cua NXB " + nxbCanTim + ":");
        boolean timThay = false;

        for (Sach s : listSach) {
            if (s instanceof SachGiaoKhoa && s.nhaXuatBan.equalsIgnoreCase(nxbCanTim)) {
                System.out.println(s.toString());
                timThay = true;
            }
        }
        if (!timThay)
            System.out.println("Khong tim thay sach nao.");
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Tong thanh tien tung loai");
            System.out.println("4. Trung binh don gia sach tham khao");
            System.out.println("5. Tim sach giao khoa theo NXB");
            System.out.println("0. Thoat");

            int chon = Library.getInt("Chon chuc nang: ", 0, 5);
            switch (chon) {
                case 1:
                    nhapSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    tongTienTungLoai();
                    break;
                case 4:
                    trungBinhDonGiaSTK();
                    break;
                case 5:
                    timSachTheoNXB();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Chon sai!");
            }
        }
    }
}