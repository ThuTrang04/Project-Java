package bai1;

import java.util.Scanner;

public class xuly {

    public static void baione() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += (i * 2);
        }
        System.out.println("Exercise 1: Sum of first 10 even numbers is: " + total);
    }

    public static void bai2() {
        System.out.println("Exercise 2: Odd numbers from 1 to 99:");
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bai3() {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                total += i;
            }
        }
        System.out.println("Exercise 3: Sum of numbers divisible by 7 (1 to 100) = " + total);
    }

    public static void bai4(Scanner scanner) {
        System.out.print("Exercise 4: Enter n: ");
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("Sum from 1 to " + n + " = " + total);
    }

    public static void bai5(Scanner scanner) {
        System.out.print("Exercise 5: Enter n: ");
        int n = scanner.nextInt();

        int total = 0;
        if (n <= 0) {
            System.out.println("Invalid value! Please re-enter (n must be non-zero): ");
            return;
        }

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i += 2) {
                total += i;
            }
            System.out.println("n is EVEN. Sum of odd numbers from 1 to " + n + " = " + total);
        } else {
            for (int i = 2; i <= n; i += 2) {
                total += i;
            }
            System.out.println("n is ODD. Sum of even numbers from 1 to " + n + " = " + total);
        }
    }

    public static void bai6(Scanner scanner) {
        System.out.print("Exercise 6: How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        System.out.print("Enter number 1: ");
        int first = scanner.nextInt();
        int min = first;
        int max = first;

        for (int i = 1; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int next = scanner.nextInt();

            if (next < min)
                min = next;
            if (next > max)
                max = next;
        }

        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }

    public static void bai7(Scanner scanner) {
        System.out.println("Exercise 7: Solve linear equation ax + b = 0");// giải pt bậc nhất
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");// pt vô số nghiệm
            } else {
                System.out.println("No solution.");// pt vô nghiệm
            }
        } else {
            double x = -b / a;
            System.out.println("Solution x = " + x);// pt có 1 nghiệm
        }
    }

    public static void bai8(Scanner scanner) {
        System.out.print("Exercise 8: Enter an integer: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is ZERO.");
        } else if (number % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }
    }
}
