package project1;
import java.util.Scanner;
public class ordermenu {
	public static void main(String []args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to our resturant online service ");
		System.out.println("~~~~~~~~~~~");
		System.out.println("1.Register");
		System.out.println("2.I have already an account >>login");
		int i=input.nextInt();
		if (i==1) {
        register x1=new register();
		}
		else if(i==2) {
		login z1=new login();	
		}
		else {
			System.out.println("Invalid option");
		}
		System.out.println("~~~~~~~~~~~");
		System.out.println("Please choose the suitable language ");
		System.out.println("1.العربيه");
		System.out.println("2.English");
		System.out.println("Your choice is ");
		int s=input.nextInt();
		if (s==1) {
			
			Language.arabic();
		}
		else if(s==2) {
		Language.english();
    	
    }
	
}	}
	

