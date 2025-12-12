package buoi2;
import java.util.Scanner;

public class Buoi2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        boolean check = true;
        
        System.out.println("Please enter your name: ");
        String yourName = input.nextLine();

       
        String yourGender;
        System.out.println("Please enter your gender (men/women): ");
         yourGender = input.nextLine().toLowerCase();//toLowerCase: chỉ nam với nữ
         while (check) {
        if (yourGender.equals("men")) {
            System.out.println("Gender: Men");
            break;
        } else if (yourGender.equals("women")) {
            System.out.println("Gender: Women");
            break;
        } else {
            System.out.println("Please re-enter (men/women)");
            yourGender = input.nextLine();
            continue;
        }
        }

        float yourAge;  
        

        System.out.println("Please enter your age: ");

        
        while (true) { 
            try {
                yourAge = input.nextInt();
                
                if (yourAge >= 18 && yourAge <= 40) {
                    break;
                } else {
                    System.out.println("write again age:");
                }
            } catch (Exception e) {
                System.out.println("write again age:");
                input.nextLine();
            }
        }


        System.out.println("Please enter your exam score: ");
        float yourExampoint = input.nextFloat();

        while (yourExampoint < 0 || yourExampoint > 10 ) { //điều kiện true or flase
            System.out.println("Invalid score please re-enter.");
            System.out.println("Enter score from 0 to 10.");
            yourExampoint= input.nextFloat();
        }
       
        String rating;
        if (yourExampoint >= 8) {
            rating = "Good";
        } else if (yourExampoint >= 6.5) {
            rating = "rather";
        } else if (yourExampoint >= 5) {
            rating = "medium";
        } else {
            rating = "weak";
        }
        
        
        
        System.out.println("Your Name: "+ yourName);
        System.out.println("your Gender: "+ yourGender);
        System.out.println("your Age "+ yourAge);
        System.out.println("your ExamDay: "+ yourExampoint);
        System.out.println("your ExamDay: "+ rating);
        
        
        




    }
}
