//1. Nhập hai số từ bàn phím, in ra số lớn nhất.//
//2. Nhập tên, tuổi, họ; sau đó hiển thị "Tên đầy đủ của bạn là: họ, tên, và tuổi là..."//

import java.util.Scanner;

public class Bai2_a {
    public static void main(String[] argss){
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
            int so1= input.nextInt();
        System.out.println("Enter number: ");
            int so2= input.nextInt();
        if (so1 >= so2){
            System.out.println(so1+": This is maximum number");
        }else {
            System.out.println(so2+": This is maximum number");
        }
 }
    
}
