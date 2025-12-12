package Demo;

public class Main {
	
	public static void main(String[] args)
	{
		//Khởi tạo lớp book sử dụng constructor ko có tham số
		Book bk1 = new Book("Toán rời rạc", 1000);  //bk là khởi tạo biến đối tượng
		bk1.inthongtin();
		//Khởi tạo lớp book sử dụng constructor có tham số
		Book bk2= new Book();
		bk2.setTieude("Vật lý đại cương");
		bk2.setGiabia(200000);
		bk2.inthongtin();
		
			}
}
