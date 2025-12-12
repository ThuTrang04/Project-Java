//Bài 1: Nhập chiều cao, cân nặng → tính BMI → in ra phân loại  có dùng if else
import java.util.Scanner;
public class TinhlaiBMI {
    public static void main(String[] argess){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your tall: ");
            double tall= input.nextDouble();
        System.out.println("Enter your weght: ");
            double weght= input.nextDouble();
            double BMI= weght / (tall*tall);
        System.out.printf("%.2f%n", BMI);
        input.close();

        if (BMI < 18.5){
            System.out.println("you are skinny");
    }   else if(BMI < 25){
            System.out.println("you are normal");
    }   else if(BMI < 35){
            System.out.println("you are overweght");
    }   else{
            System.out.println("you are obese");
    }
}
}