package buoi9.baiso1;

import Library.Library;

public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;
    private double soTienPhaiTra;

    public BienLai() {
        this.khachHang = new KhachHang();
    }

    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public double getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void tinhTienDien() {
        this.soTienPhaiTra = (double) (chiSoMoi - chiSoCu) * 850000;
    }

    public void nhapBienLai() {
        khachHang.nhapThongTin();
        this.chiSoCu = Library.getInt("Nhập chỉ số cũ: ");
        this.chiSoMoi = Library.getInt("Nhập chỉ số mới: ");
    }

    public void hienThiBienLai() {
        System.out.println("--- Thông tin biên lai ---");
        khachHang.hienThiThongTin();
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.printf("Số tiền phải trả: %.0f VND\n", soTienPhaiTra);
    }
}
