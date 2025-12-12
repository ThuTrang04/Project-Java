
//Bài 2: Nhập 3 số → in số lớn nhất
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] argess) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int number_one = input.nextInt();
        System.out.println("Enter number two: ");
        int number_two = input.nextInt();
        System.out.println("Enter number three: ");
        int number_three = input.nextInt();

        input.close();
        if (number_one >= number_two)
            if (number_one >= number_three) {
                System.out.println("This is number max: " + number_one);
            } else {
                System.out.println("This is number max: " + number_three);
            }
        else {
            if (number_two >= number_three) {
                System.out.println("This is number max: " + number_two);
            } else {
                System.out.println("This is number max: " + number_three);
            }
        }
    }
}
