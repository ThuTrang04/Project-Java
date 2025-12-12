package Demo;

public class Book {
	//khai báo 2 thuộc tính
	private String Tieude;
	private int Giabia;
	
	//Khai báo 2 constructor có tham số

	public Book(String tieude, int giabia) {
		this.Tieude = tieude; this.Giabia = giabia;
	}
	//Khai báo 2 constructor ko có tham s
	public Book() {};
	
	//Khai báo phương thức get dữ liệu
	public String getTieude() {return this.Tieude;}
	public int getGiabia() {return this.Giabia;};
	
	//Khai báo phương thức set dữ liệu
	public void setTieude(String td) {this.Tieude = td;}
	public void setGiabia(int gb)
	{
		if(gb < 0 ) {System.out.println("Giá bìa > 0!");	}
		else {this.Giabia = gb;}
	}
	//phương thức in thông tin sách
	public void inthongtin()
	{
		System.out.println("Tên sách: "+ this.Tieude +".");
		System.out.println("Giá: "+ this.Giabia +".");
	}
}
