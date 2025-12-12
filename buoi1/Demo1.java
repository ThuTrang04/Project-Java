package buoi1;
 import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                 
        System.out.println("please enter Your Name: ");
        String Your_Name= input.nextLine();
        

        System.out.println("please enter Gender: ");
        String Gender= input.nextLine();
    

        System.out.println("please enter Date of birth : ");
        String Date_of_birth= input.nextLine();
       
        System.out.println("please enter email: ");
        String Your_email= input.nextLine();
       
        System.out.println("please enter your phone : ");
        String Your_phone= input.next();

        System.out.println("Your name: "+ Your_Name);
        System.out.println("Gender: "+ Gender);
        System.out.println("Gender: "+ Date_of_birth);
        System.out.println("Gender: "+ Your_email);
        System.out.println("Gender: "+ Your_phone);

        
        

    }
    
}
