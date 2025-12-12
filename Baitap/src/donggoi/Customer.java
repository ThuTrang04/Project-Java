package donggoi;

public class Customer {
	//Khai báo 3 thuộc tính
	private String Hoten;
	private String Sonha;
	private int Id_congto;
	//khai báo 3 constructor có tham số
	public Customer(String Hoten,String Sonha, int Id_congto) {
		this.Hoten = Hoten; 
		this.Sonha = Sonha; 
		this.Id_congto = Id_congto;
	}
	//Khai báo 3 constructor không có tham số
	public Customer() {}
	//Khai báo phương thức get dữ liệu
	public String getHoten() {
		return this.Hoten;
		}
	public String getSonha() {
		return this.Sonha;
		}
	public int getId_congto() {
		return this.Id_congto;
		}
	// Khai báo phương thức set dữ liệu
	public void setHoten(String Ht) {
		this.Hoten = Ht;
		}
	public void setSonha(String Sn) {
		this.Sonha = Sn;
		}
	public void setId_congto(int Id) {
		if (Id < 0) {
			System.out.println("Id phải lớn hơn 0!");
		}
		else {
			this.Id_congto = Id;
		}
	}
	//phương thức in Customer
	public void xuatCustomer()
	{
		System.out.println("Họ tên: "+ this.Hoten +".");
		System.out.println("Số nhà: "+ this.Sonha +".");
		System.out.println("Id công tơ: "+ this.Id_congto + ".");
	}

	
	
	
	

}
