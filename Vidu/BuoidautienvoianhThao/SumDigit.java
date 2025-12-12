import java.util.Scanner;

public class SumDigit {
    
    // Hàm tính tổng các chữ số
    public static int sumDigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10; // lấy chữ số cuối cộng vào sum
            n = n / 10;    // bỏ chữ số cuối
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so n: ");
        int n = input.nextInt();

        int result = sumDigit(n);

        System.out.println("Tong cac chu so = " + result);
        
        input.close();
    }
}
