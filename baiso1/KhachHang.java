package buoi9.baiso1;

import Library.Library;

public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoTen, String soNha, String maSoCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }


    public void nhapThongTin() {
        this.hoTen = Library.getString("Nhập họ tên chủ hộ: ", true);
        this.soNha = Library.getString("Nhập số nhà: ", true);
        this.maSoCongTo = Library.getString("Nhập mã số công tơ: ", true);
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên chủ hộ: " + hoTen);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maSoCongTo);
    }

}

