package buoi11;

public class FullTimeEmployer extends Employer {
    private double LuongCoBan;
    
    public FullTimeEmployer() {
        super();
    }
    public FullTimeEmployer(String Hoten, int Tuoi, String MaNV, Double HeSoLuong, double LuongCoBan) {
        super(Hoten, Tuoi, MaNV, HeSoLuong);
        this.LuongCoBan = LuongCoBan;
    }
    @Override
    public double TinhLuong() {
        return this.LuongCoBan*HeSoLuong;
    }
    @Override
    public String toString() {
        return String.format("%s|%s|%d|%.2f",MaNV,Hoten,Tuoi,TinhLuong());
    }
}
