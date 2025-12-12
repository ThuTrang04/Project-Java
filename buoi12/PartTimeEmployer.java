package buoi11;

public class PartTimeEmployer extends Employer {
    private Integer SoGioLam;
    private Double DonGia;

    public PartTimeEmployer() {
        super();
    }

    public PartTimeEmployer(String Hoten, int Tuoi, String MaNV, Double HeSoLuong, Integer SoGioLam, Double DonGia) {
        super(Hoten, Tuoi, MaNV, HeSoLuong);
        this.SoGioLam = SoGioLam;
        this.DonGia = DonGia;
    }
    public double TinhLuong(){
        return this.SoGioLam*this.DonGia;
    }
    @Override
    public String toString() {
        return String.format("%s|%s|%d|%.2f",MaNV,Hoten,Tuoi,TinhLuong());
    }
}
