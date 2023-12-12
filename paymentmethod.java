package project1;

import java.util.Scanner;

public class paymentmethod {
	Scanner input = new Scanner(System.in);
	   
    public   paymentmethod() {
    	System.out.println("Hi there welcome to payment page");
        System.out.println("Choose a suitable way to pay:");
    	System.out.println("1.Cash"+"\n"+"2.Paypal"+"\n"+"3.Visa");
        int opp = input.nextInt();
        

        switch (opp) {
        case 1:
        	System.out.println("Please give the money to the delivery person ");
        	break;
        case 2:
        
            System.out.print("Type your account number:");
            int num = input.nextInt();
            System.out.print("Type your password:");
            int password = input.nextInt();
            System.out.println("Payment Completed successfully");
            break;
         case 3:
            System.out.print("Type visa number here:");
            int number = input.nextInt();
            System.out.print("Type CCV here:");
            int ccv = input.nextInt();
            System.out.print("Type the expiry date here:");
            int exp = input.nextInt();
            System.out.println("Payment Completed successfully");
            break;
      default:
            System.out.println("Invalid option");
            break;
        }
    }
   
       

}
