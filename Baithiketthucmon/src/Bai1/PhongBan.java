package Bai1;

import java.util.Scanner;

public class PhongBan {
    private String maPhong;
    private String tenPhong;
    private String tenTruongPhong;
    
    public PhongBan() {
    }
    
    public PhongBan(String maPhong, String tenPhong, String tenTruongPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.tenTruongPhong = tenTruongPhong;
    }
    
    // Getter và Setter
    public String getMaPhong() {
        return maPhong;
    }
    
    public void setMaPhong(String maPhong) {
        if (maPhong == null || maPhong.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã phòng không được để trống");
        }
        this.maPhong = maPhong;
    }
    
    public String getTenPhong() {
        return tenPhong;
    }
    
    public void setTenPhong(String tenPhong) {
        if (tenPhong == null || tenPhong.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên phòng không được để trống");
        }
        this.tenPhong = tenPhong;
    }
    
    public String getTenTruongPhong() {
        return tenTruongPhong;
    }
    
    public void setTenTruongPhong(String tenTruongPhong) {
        if (tenTruongPhong == null || tenTruongPhong.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên trưởng phòng không được để trống");
        }
        this.tenTruongPhong = tenTruongPhong;
    }
    
    // Nhập thông tin phòng từ bàn phím
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Nhập mã phòng: ");
                String maPhongInput = sc.nextLine();
                if (maPhongInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Mã phòng không được để trống!");
                    continue;
                }
                this.maPhong = maPhongInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Nhập tên phòng: ");
                String tenPhongInput = sc.nextLine();
                if (tenPhongInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Tên phòng không được để trống!");
                    continue;
                }
                this.tenPhong = tenPhongInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Nhập tên trưởng phòng: ");
                String tenTruongPhongInput = sc.nextLine();
                if (tenTruongPhongInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Tên trưởng phòng không được để trống!");
                    continue;
                }
                this.tenTruongPhong = tenTruongPhongInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    
    // Hiển thị thông tin phòng
    public void hienThiThongTin() {
        System.out.println("Phòng: " + tenPhong + " (" + maPhong + ") - Trưởng phòng: " + tenTruongPhong);
    }
    
    @Override
    public String toString() {
        return tenPhong + " (" + maPhong + ")";
    }
}