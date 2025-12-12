package donggoi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         

       
        // 1. KHỞI TẠO CUSTOMER BẰNG CONSTRUCTOR CÓ THAM SỐ
       
        Customer KH1 = new Customer("Thu Trang", "54 Mạc Thị Bưởi", 1);
        KH1.Customer();   // Xuất thông tin

      
        // 2. KHỞI TẠO BIÊN LAI (BienLai)

        Bienlai bl1 = new Bienlai(200, 255, "12 Nguyễn Trãi", 5);
        bl1.Customer();  // Xuất biên lai

      
       
        // 4. KHỞI TẠO CUSTOMER BẰNG CONSTRUCTOR KHÔNG THAM SỐ
      
        Customer KH2 = new Customer();  
        KH2.setHoten("Chon Chon");
        KH2.setSonha("14 Nguyễn Trung Trực");
        KH2.setId_congto(2);

        KH2.Customer(); // Xuất thông tin

     
    }
}
