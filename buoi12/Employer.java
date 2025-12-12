package buoi13;

public class Employer extends Person {
    protected String MaNV;
    protected Double HeSoLuong;

    public Employer() {
        super();
    }

    public Employer(String Hoten, int Tuoi, String MaNV, Double HeSoLuong) {
        super(Hoten, Tuoi);
        this.MaNV = MaNV;
        this.HeSoLuong = HeSoLuong;
    }
    public double TinhLuong(){
        return 0;
    }
    @Override
    public String toString() {
        return String.format("%s|%s|%d|%.2f",MaNV,Hoten,Tuoi,TinhLuong());
    }
}
