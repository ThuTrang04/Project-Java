package buoi13.bai1;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public String toString() {
        return super.toString() + " | Thue: " + thue + " | Thanh tien: " + thanhTien();
    }
}
