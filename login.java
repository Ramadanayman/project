package project1;
import java.util.Scanner;

public class login {
    Scanner input = new Scanner(System.in);
   
    public  login() {
    	System.out.println("Hi there welcome to login page");
    	System.out.println("Please follow steps to login ");
        System.out.println("Choose a suitable way to login:");
    	System.out.println("1.Facebook"+"\n"+"2.Twitter"+"\n"+"3.Google");  
    	int opp = input.nextInt();
    	
        input.nextLine(); 

        switch (opp) {
        case 1:
        case 3:
        
            System.out.print("Type your email or phone number:");
            String email = input.nextLine();
            System.out.print("Type your password:");
            String password = input.nextLine();
            System.out.println("Logged in successfully");
            break;
         case 2:
            System.out.print("Type username here:");
            String username = input.nextLine();
            System.out.print("Type password here:");
            String pass = input.nextLine();
            System.out.println("Logged in successfully");
            break;
      default:
            System.out.println("Invalid option");
            break;
        }
    }
   
       

}