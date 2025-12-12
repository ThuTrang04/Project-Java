
//2. Nhập tên, tuổi, họ; sau đó hiển thị "Tên đầy đủ của bạn là: họ, tên, và tuổi là..."//
import java.util.Scanner;

public class Bai2_b {
    public static void main(String[] argss) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String your_name = input.nextLine();
        System.out.println("first name: " + your_name);

        System.out.println("Enter your last name");
        String your_last_name = input.nextLine();
        System.out.println("after that last name: " + your_last_name);

        System.out.println("Enter your age");
        int your_age = input.nextInt();
        System.out.println("after that age: " + your_age);

        System.out.println("What is your full name: ");

        String fullname = (your_last_name + " " + your_name);

    }

}
