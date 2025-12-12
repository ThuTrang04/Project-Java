package bai1;
import java.util.Scanner;

public class cau1 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        xuly xl = new xuly();

        while (true) {
            System.out.println("===== PROGRAM MENU =====");
            System.out.println("1. Print sum of the first 10 even numbers");
            System.out.println("2. Print odd numbers from 1 to 99");
            System.out.println("3. Print sum of numbers divisible by 7");
            System.out.println("4. Print sum from 1 to n");
            System.out.println("5. Print sum of odd or even numbers up to n");
            System.out.println("6. Print the smallest and largest value");
            System.out.println("7. Solve linear equation ax + b = 0");
            System.out.println("8. Check if a number is even or odd");
           

            System.out.println("0. Exit");
            System.out.print("Please choose an option: ");
            int luaChon = scanner.nextInt();

            scanner.nextLine(); // consume buffer

            switch (luaChon) {
                case 1:
                	xl.baione();
                    System.exit(0);
                    break;
                case 2:
                	xl.bai2();
                    System.exit(0);
                    break;
                case 3:
                	xl.bai3();
                    System.exit(0);
                    break;
                case 4:
                	xl.bai4(scanner);
                    System.exit(0);
                    break;
                case 5:
                	xl.bai5(scanner);
                    System.exit(0);
                    break;
                case 6:
                	xl.bai6(scanner);
                    System.exit(0);
                    break;
                case 7:
                	xl.bai7(scanner);
                    System.exit(0);
                    break;
                case 8:
                	xl.bai8(scanner);
                    System.exit(0);
                    break;
                case 0:
                    System.out.println("Program ended. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}
