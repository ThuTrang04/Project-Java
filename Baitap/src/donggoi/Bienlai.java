package donggoi;

public class Bienlai {
	//Khai báo 4 thuộc tính
	private int Ma_bien_lai;
	private float Sotien;
	private String Sonha;
	private int Id_congto;
	//khai báo 4 constructor có tham số
	public Bienlai(int Ma_bien_lai,float Sotien,String Sonha, int Id_congto) {
		this.Ma_bien_lai = Ma_bien_lai; this.Sotien = Sotien;this.Sonha = Sonha; this.Id_congto = Id_congto;
	}
	//Khai báo 4 constructor không có tham số
	public Bienlai() {}
	//Khai báo phương thức get dữ liệu
	public int getMa_bien_lai() {return this.Ma_bien_lai;}
	public float getSotien() {return this.Sotien;}
	public String getSonha() {return this.Sonha;}
	public int getId_congto() {return this.Id_congto;}
	// Khai báo phương thức set dữ liệu
	public void setMa_bien_lai(int Mbl){
		if (Mbl < 0 ) {
			System.out.println("Mã biên lai phải lớn hơn 0!");
		}else {
			this.Ma_bien_lai = Mbl;
		}
	}
	public void setSotien(float St) {
		if (St < 0) {
			System.out.println("Số tiền phải lớn không!");
		}else {
			this.Sotien = St;
		}
			
	}
	
	public void setSonha(String Sn) {this.Sonha = Sn;}
	public void setId_congto(int Id) {
		if (Id < 0) {
			System.out.println("Id phải lớn hơn 0!");
		}
		else {
			this.Id_congto = Id;
		}
	}
	//phương thức in Biên lai
	public void Bienlai()
	{
		System.out.println("Mã biên lai: "+ this.Ma_bien_lai +".");
		System.out.println("Số tiền: "+ this.Sotien +".");
		System.out.println("Số nhà: "+ this.Sonha +".");
		System.out.println("Id công tơ: "+ this.Id_congto + ".");
	}

	
	
		
		


	

}
