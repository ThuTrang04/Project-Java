package bai8.src;
import java.util.Scanner;
public class PHANSO 
{
	// khai báo 2 thuộc tính
	private int tuso, mauso;
	// 2 hàm dựng
	public PHANSO () { };
	public PHANSO(int ts, int ms) {this.tuso = ts; this.mauso = ms;}
	
	// phương thức lấy dữ liệu của thuộc tính
	public int getTS() 	{ return tuso; 	}
	public int getMS() { return mauso; 	}
	// phương thức ghi dữ liệu của thuộc tính
	public void setTS(int ts) {this.tuso = ts;}
	public void setMS(int ms) {this.mauso = ms;}
	
	//hàm dùng nhập, bẫy lỗi
	public int nhapsonguyen ()
	{
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	//phương thức tìm UCLN
    public int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return timUCLN(b, a % b);
        }
    }
    // phương thức tìm BCNN
    public int timBCNN(int a, int b) {
    	return a * b / timUCLN(a, b);
    }
	
	// phương thức RGPS
    public void rutGonPS()
    {
        int ucln = timUCLN(this.tuso, this.mauso);
        this.tuso = this.tuso / ucln;
        this.mauso = this.mauso / ucln;
    }
	
	//phương thức nhập
	public void nhapPS ()
	{
		System.out.println("Nhập tử :");
		this.tuso = nhapsonguyen();
		System.out.println("Nhập mẫu :");
		do {
			this.mauso = nhapsonguyen();
			if (this.mauso == 0) {
				System.out.println("Mẫu số phải khác 0. Vui lòng nhập lại!");
			}
		} while (this.mauso == 0);
	}
	// phương thức xuất
	public void xuatPS( )
	{
		rutGonPS();
		if (this.mauso == 1)
			System.out.println("Kết quả: " + this.tuso);
		else
			System.out.println("Phân số: " + this.tuso + "/" + this.mauso);
	}
	
	// Phương thức công 2 phân số
	public void cong2PS(PHANSO ps2)
	{
		// Tìm mẫu số chung nhỏ nhất (BCNN) để tối ưu phép cộng
		int mauSoChung = timBCNN(this.mauso, ps2.mauso);
		
		// Quy đồng tử số và cộng chúng lại
		this.tuso = this.tuso * (mauSoChung / this.mauso) + ps2.tuso * (mauSoChung / ps2.mauso);
		this.mauso = mauSoChung;
		
		System.out.print("Tổng 2 phân số: ");
		xuatPS();
	}
	
}