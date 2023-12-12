package project1;

import java.util.Scanner;

public class paymentarabic {
	Scanner input = new Scanner(System.in);
	   
    public  paymentarabic() {
    	System.out.println("أهلا بك في صفحة الدفع ");
        System.out.println("أختر الطريقة المناسبة للدفع:");
    	System.out.println("1.كاش"+"\n"+"2.بايبال"+"\n"+"3.فيزا");
        int opp = input.nextInt();
        

        switch (opp) {
        case 1:
        	System.out.println("من فضلك قم بإعطاء النقود الى عامل التوصيل ");
        	break;
        case 2:
        
            System.out.print("قم بكتابة رقم الحساب:");
            int num = input.nextInt();
            System.out.print("قم بكتابة كلمه السر :");
            int password = input.nextInt();
            System.out.println("تم الدفع بنجاح ");
            break;
         case 3:
            System.out.print("قم بكتابة رقم الفيزا:");
            int number = input.nextInt();
            System.out.print("قم بكتابة رقم ccv:");
            int ccv = input.nextInt();
            System.out.print("قم بكتابة تاريخ الانتهاء:");
            int exp = input.nextInt();
            System.out.println("تم الدفع بنجاح");
            break;
      default:
            System.out.println("خيار غير صحيح");
            break;
        }
    }
   
       

}
