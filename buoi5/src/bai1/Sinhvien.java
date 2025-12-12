package bai1;
import java.util.*;

public class Sinhvien 
{
	//khai báo thuộc tính
	String MaSV;
	String Hoten;
	float Diem;
	
	
	//Khai báo định nghĩa phương thức
	
	public String Xeploai(float Diem) {
		
		String loai;
		if(Diem > 8 ) {loai= "Giỏi";}
		else
		{
			if(Diem > 7 ) {loai= "Khá";}
			else
			{
				if(Diem > 5 ) {loai= "Trung bình";}
				else {loai = "Yếu";}
			}
		}
		
		return loai;
	}
	//Phương thức nhập một sinh viên
	public void NhapSV()
	{
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Nhập mã sinh viên:\t");
		this.MaSV = sn.nextLine();
		System.out.println("Nhập họ tên sinh viên:\t");
		this.Hoten = sn.nextLine();
		System.out.println("Nhập điểm thi:\t");
		this.Diem = sn.nextFloat();
		
	}
	//Phương thức xuất 1 sinh viên
	public void XuatSV() 
	{
		System.out.println("Mã sinh viên:\t" + this.MaSV);
		System.out.println("Họ tên sinh viên:\t" + this.Hoten);
		System.out.println("Điểm thi:\t" + this.Diem);
		System.out.println("Điểm thi:\t" + this.Xeploai(Diem));
		
		
	}
	

}
