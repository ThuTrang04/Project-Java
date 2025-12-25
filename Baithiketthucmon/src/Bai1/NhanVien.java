package Bai1;

import java.util.Scanner;

public class NhanVien {
    private String ten;
    private String chucVu;
    
    public NhanVien() {
    }
    
    public NhanVien(String ten, String chucVu) {
        this.ten = ten;
        this.chucVu = chucVu;
    }
    
    // Getter và Setter
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên nhân viên không được để trống");
        }
        this.ten = ten;
    }
    
    public String getChucVu() {
        return chucVu;
    }
    
    public void setChucVu(String chucVu) {
        if (chucVu == null || chucVu.trim().isEmpty()) {
            throw new IllegalArgumentException("Chức vụ không được để trống");
        }
        this.chucVu = chucVu;
    }
    
    // Nhập thông tin nhân viên từ bàn phím
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Nhập tên nhân viên: ");
                String tenInput = sc.nextLine();
                if (tenInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Tên nhân viên không được để trống!");
                    continue;
                }
                this.ten = tenInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Nhập chức vụ: ");
                String chucVuInput = sc.nextLine();
                if (chucVuInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Chức vụ không được để trống!");
                    continue;
                }
                this.chucVu = chucVuInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    
    // Hiển thị thông tin nhân viên
    public void hienThiThongTin() {
        System.out.println("Nhân viên: " + ten + " - Chức vụ: " + chucVu);
    }
    
    @Override
    public String toString() {
        return ten + " - " + chucVu;
    }
}