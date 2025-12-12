//bài 1 Viết chương trình nhập tên, năm sinh và tính tuổi từ bàn phím //
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] argss) { 
        Scanner input = new Scanner(System.in); // biến dùng để lấy giá trị nhập từ bàn phím
        
        System.out.println("Enter your name: ");
            String name = input.nextLine();
        System.out.println("tên 1: " + name);
        System.out.println("Enter your year of birth: ");
            int yearOfBirth = input.nextInt();
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Enter current year: ");
            int year =input.nextInt();
            int age = year - yearOfBirth ;
        System.out.println("Your age: " + age);
    }
}