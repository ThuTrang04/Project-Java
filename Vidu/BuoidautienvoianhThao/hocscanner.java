   import java.util.Scanner;
public class hocscanner {
    public static void main(String[] args) {
        System.out.println("Please enter length:");
        Double length= new Scanner(System.in).nextDouble();
        System.out.println("Please enter width: ");
        Double width= new Scanner(System.in).nextDouble();
        Double Perimeter = 2 * (length + width);
        Double Area = length * width;
        System.out.println("Perimeter of the rectangle is: "+Perimeter);
        System.out.println("Area of the rectangle is: "+ Area);
    }
} 
}

