//nhập chiều dài và chiều rộng của hình chữ nhật in ra diện tích và chu vi

import java.util.Scanner;
public class tinhchuvi {
    public static void main(String[] arge){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length: ");
        int Length = input.nextInt();

        System.out.println("please enter width: ");
        int Width = input.nextInt();

        int acreage = Length * Width;
        int perimeter = (Length + Width) * 2;

        System.out.println("acreage: " + acreage);
        System.out.println("perimeter: " + perimeter);



    }
    
}
