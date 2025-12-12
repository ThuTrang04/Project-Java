package buoi13.bai1;

public class Sach {
    //Thuoc tinh
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;
    //phuong thuc mac dinh
    public Sach() {
    }
    //phuong thuc khoi tao
    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }
    //phuong thuc tinh tien
    public double thanhTien() {
        return 0;
    }
    //phuong thuc toString
    @Override
    public String toString() {
        return String.format("%s | %s | %.0f | %d | %s", maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
    }
}
