package bai2;
import java.util.Scanner;
import java.util.Arrays;

public class xuly {
    private int[] mang;

//    Câu 1: Nhập mảng
    public void nhapMang(Scanner sc) {
        System.out.println("\n--- NHẬP MẢNG ---");
        
        int n;
        do {
            System.out.print("Nhập số phần tử (>=1): ");
            n = nhapSoNguyen(sc);
            if (n < 1) {
                System.out.println("✗ Số phần tử phải >= 1!");
            }
        } while (n < 1);
        
        mang = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("  Phần tử [" + i + "]: ");
            mang[i] = nhapSoNguyen(sc);
        }
        
        System.out.println("✓ Nhập mảng thành công!");
    }
    
    // Câu 2: Xuất mảng 
    public void xuatMang() {
        System.out.println("\n--- XUẤT MẢNG ---");
        
        if (!kiemTraMang()) return;
        
        System.out.println("Mảng hiện tại:");
        System.out.println("  " + Arrays.toString(mang));
    }
    
    // Câu 3: Sắp xếp giảm dần 
    public void sapXepGiamDan() {
        System.out.println("\n--- SẮP XẾP GIẢM DẦN ---");
        
        if (!kiemTraMang()) return;
    
        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
        
        System.out.println("✓ Đã sắp xếp giảm dần!");
        xuatMang();
    }
    
    // Câu 4: Chèn phần tử vào mảng (sắp xếp theo thứ tự giảm dần)
    public void chenPhanTu(Scanner sc) {
        System.out.println("\n--- CHÈN PHẦN TỬ ---");
        
        if (!kiemTraMang()) return;
        
        System.out.print("Nhập phần tử cần chèn: ");
        int phanTuMoi = nhapSoNguyen(sc);
        
        int[] mangMoi = new int[mang.length + 1];
        System.arraycopy(mang, 0, mangMoi, 0, mang.length);
        mangMoi[mang.length] = phanTuMoi;
        
        mang = mangMoi;
        
        sapXepGiamDan();
        
        System.out.println("✓ Đã chèn phần tử và sắp xếp giảm dần!");
        xuatMang();
    }

    // Câu 5: Trộn 2 mảng theo đúng thứ tự sắp xếp
    public void tronHaiMang(Scanner sc) {
        System.out.println("\n--- TRỘN 2 MẢNG ---");

        if (!kiemTraMang()) return;

        System.out.println("Nhập mảng thứ hai để trộn:");
        System.out.print("Nhập số phần tử mảng thứ hai: ");
        int n2 = nhapSoNguyen(sc);
        int[] mang2 = new int[n2];
        System.out.println("Nhập các phần tử cho mảng thứ hai:");
        for (int i = 0; i < n2; i++) {
            System.out.print("  Phần tử [" + i + "]: ");
            mang2[i] = nhapSoNguyen(sc);
        }

        int[] mangMoi = new int[mang.length + mang2.length];
        System.arraycopy(mang, 0, mangMoi, 0, mang.length);
        System.arraycopy(mang2, 0, mangMoi, mang.length, mang2.length);
        mang = mangMoi;

        sapXepGiamDan();

        System.out.println("✓ Đã trộn và sắp xếp 2 mảng!");
        xuatMang();
    }

    // Câu 6: Tìm lớn hơn trung bình
    public void timLonHonTrungBinh() {
        System.out.println("\n--- TÌM PHẦN TỬ LỚN HƠN TRUNG BÌNH ---");
        
        if (!kiemTraMang()) return;
        
        double tong = 0;
        for (int giaTriHienTai : mang) {
            tong += giaTriHienTai;
        }
        double trungBinh = tong / mang.length;
        
        System.out.printf("Giá trị trung bình: %.2f\n", trungBinh);
        
        System.out.print("Các phần tử lớn hơn: ");
        boolean coKetQua = false;
        
        for (int giaTriHienTai : mang) {
            if (giaTriHienTai > trungBinh) {
                System.out.print(giaTriHienTai + " ");
                coKetQua = true;
            }
        }
        
        if (!coKetQua) {
            System.out.print("(Không có)");
        }
        System.out.println();
    }
    
    // HÀM HỖ TRỢ 
    
    private boolean kiemTraMang() {
        if (mang == null || mang.length == 0) {
            System.out.println("✗ Mảng rỗng! Vui lòng nhập mảng trước (Chọn chức năng 1).");
            return false;
        }
        return true;
    }
    
    public static int nhapSoNguyen(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.print("✗ Vui lòng nhập số nguyên: ");
                sc.nextLine(); 
            }
        }
    }
}
