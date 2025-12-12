package buoi1;
import java.util.Scanner;
public class Buoi1 {
    public static void main(String[] arge) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Math point: ");
        Float Math_point = input.nextFloat();

        System.out.println("Please enter physics point: ");
        Float physics_point = input.nextFloat();

        System.out.println("Please enter chemistry point: ");
        Float chemistry_point = input.nextFloat();

        
        Float Average_score = (Math_point + physics_point + chemistry_point) / 3;

        System.out.println("Average score: " + Average_score);
    }
    
}
