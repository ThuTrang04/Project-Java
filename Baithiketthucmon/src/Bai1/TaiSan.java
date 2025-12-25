package Bai1;

import java.util.Scanner;

public class TaiSan {
    private String tenTaiSan;
    private int soLuong;
    private String tinhTrang;
    
    public TaiSan() {
    }
    
    public TaiSan(String tenTaiSan, int soLuong, String tinhTrang) {
        this.tenTaiSan = tenTaiSan;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }
    
    // Getter và Setter
    public String getTenTaiSan() {
        return tenTaiSan;
    }
    
    public void setTenTaiSan(String tenTaiSan) {
        if (tenTaiSan == null || tenTaiSan.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên tài sản không được để trống");
        }
        this.tenTaiSan = tenTaiSan;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    
    public void setSoLuong(int soLuong) {
        if (soLuong < 0) {
            throw new IllegalArgumentException("Số lượng phải lớn hơn hoặc bằng 0");
        }
        this.soLuong = soLuong;
    }
    
    public String getTinhTrang() {
        return tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang) {
        if (tinhTrang == null || tinhTrang.trim().isEmpty()) {
            throw new IllegalArgumentException("Tình trạng không được để trống");
        }
        this.tinhTrang = tinhTrang;
    }
    
    // Nhập thông tin tài sản từ bàn phím
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Nhập tên tài sản: ");
                String tenTaiSanInput = sc.nextLine();
                if (tenTaiSanInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Tên tài sản không được để trống!");
                    continue;
                }
                this.tenTaiSan = tenTaiSanInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Nhập số lượng: ");
                int soLuongInput = Integer.parseInt(sc.nextLine());
                if (soLuongInput < 0) {
                    System.out.println("Lỗi: Số lượng phải lớn hơn hoặc bằng 0!");
                    continue;
                }
                this.soLuong = soLuongInput;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Số lượng phải là số nguyên!");
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Nhập tình trạng: ");
                String tinhTrangInput = sc.nextLine();
                if (tinhTrangInput.trim().isEmpty()) {
                    System.out.println("Lỗi: Tình trạng không được để trống!");
                    continue;
                }
                this.tinhTrang = tinhTrangInput;
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    
    // Hiển thị thông tin tài sản
    public void hienThiThongTin() {
        System.out.println("Tài sản: " + tenTaiSan + " - Số lượng: " + soLuong + " - Tình trạng: " + tinhTrang);
    }
    
    @Override
    public String toString() {
        return tenTaiSan + " - " + soLuong + " cái - " + tinhTrang;
    }
}