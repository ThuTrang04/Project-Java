package Bai1;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║      CHƯƠNG TRÌNH QUẢN LÝ KIỂM KÊ TÀI SẢN                   ║");
        System.out.println("║      Đề bài: Quản lý phiếu kiểm kê tài sản                  ║");
        System.out.println("║      Người thực hiện: [Tên của bạn]                         ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        
        // Tạo đối tượng xử lý
        Xulychucnang xuLy = new Xulychucnang();
        
        // Chạy menu chính
        xuLy.menu();
    }
}