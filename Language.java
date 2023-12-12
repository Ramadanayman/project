package project1;
import java.util.Scanner;
public class Language {
	public static void arabic() {
		Scanner input=new Scanner (System.in);
	
	appetizers a1=new appetizers("أصابع الموتزريلا",40);
	appetizers a2=new appetizers("أجنحة الدجاج",60);
	appetizers a3=new appetizers("حلقات بصل مكرمل",30);
	appetizers a4=new appetizers("شوربة",50);
	Rice r1 =new Rice ("أرز ولحم" , 150);
	Rice r2 =new Rice ("أرز ودجاج" , 150);
	Rice r3 =new Rice ("أرز وسمك" , 150);
	Pasta p1=new Pasta ("دجاج ومكرونة", 160);
	Pasta p2=new Pasta ("لحم ومكرونة", 200);
	Pasta p3=new Pasta ("جمبري ومكرونة", 220);
	Sandwiches s1 = new Sandwiches("ساندوتش كرانشي" , 120);
	Sandwiches s2 = new Sandwiches("ساندوتش كفتة" , 120);
	Sandwiches s3 = new Sandwiches("سندوتش جمبري" , 120);
	Drinks d1 = new Drinks ("شاي " , 20);
	Drinks d2 = new Drinks ("قهوة" , 25);
	Drinks d3 = new Drinks ("عصير طازج" ,50 );
	Drinks d4 = new Drinks ("مشروب غازي" , 25);
	int tprice=0;
	
	boolean repeat =true;
	
	while(repeat) {
	System.out.println("من فضلك اختر القسم الذي تريده ");
	System.out.println("1.المقبلات ");
	System.out.println("2.وجبات الأرز ");
	System.out.println("3.وجبات المكرونة ");
	System.out.println("4.السندوتشات ");
	System.out.println("5.المشروبات الساخنة والبارده ");
	System.out.println("6.الخروج من هذه القائمة");
	System.out.print("خيارك هو ");
	int opp=input.nextInt();
	
	switch (opp) {
	
	case 1:
		System.out.println("1."+a1.name+"  "+a1.price+" جنيه");
		System.out.println("2."+a2.name+"  "+a2.price+" جنيه");
		System.out.println("3."+a3.name+"  "+a3.price+" جنيه");
		System.out.println("4."+a4.name+"  "+a4.price+" جنيه");
		    System.out.println("خيارك هو ");
		    int u=input.nextInt();
		    if(u==1) {
		    	tprice+=a1.price;
			System.out.println("قطعتين من "+a1.name+"تم اضافتها الى طلبك ");
					
			}
		else if(u==2) {
			tprice+=a2.price;
			System.out.println("ثلاثة قطع من "+a2.name+"تم اضافتها الى طلبك");
			}
		else if(u==3) {
			tprice+=a3.price;
			System.out.println("صندوق واحد من "+a3.name+"تم اضافتها الى طلبك");
			}
		else if(u==4) {
    			tprice+=a4.price;
    			System.out.println("طبق واحد من "+a4.name+"تم اضافتها الى طلبك");
		}
		else
			System.out.println("اختيار غير صحيح");
		    
		break;
		
		
	case 2:
		System.out.println("1."+r1.name+"  "+r1.price+" جنيه");
		System.out.println("2."+r2.name+"  "+r2.price+" جنيه");
		System.out.println("3."+r3.name+"  "+r3.price+" جنيه");
			System.out.println("خيارك هو ");
			int a=input.nextInt();
    		if(a==1) {
    			tprice+=r1.price;
    			System.out.println("وجبة "+r1.name+" تم اضافتها الى طلبك");
    			}
    		else if(a==2) {
    			tprice+=r2.price;
    			System.out.println("وجبة "+r2.name+" تم اضافتها الى طلبك");
    			}
    		else if(a==3) {
    			tprice+=r3.price;
    			System.out.println("وجبة "+r3.name+" تم اضافتها الى طلبك");
    			}
    		else
    			System.out.println("خيار غير صحيح");
		break;
		
		
	case 3:
		System.out.println("1."+p1.name+"  "+p1.price+" جنيه");
		System.out.println("2."+p2.name+"  "+p2.price+" جنيه");
		System.out.println("3."+p3.name+"  "+p3.price+" جنيه");
		System.out.print(" خيارك هو");
		int b=input.nextInt();
		if(b==1) {
			tprice+=p1.price;
			System.out.println("وجبة "+p1.name+" تم اضافتها الى طلبك");
			}
		else if(b==2) {
			tprice+=p2.price;
			System.out.println("وجبة "+p2.name+" تم اضافتها الى طلبك");
			}
		else if(b==3) {
			tprice+=p3.price;
			System.out.println("وجبة "+p3.name+" تم اضافتها الى طلبك ");
			}
		else
			System.out.println("خيار غير صحيح");
		 
		break;
		
		
	case 4:
		System.out.println("1. "+s1.name+"  "+s1.price+" جنيه");
		System.out.println("2. "+s2.name+"  "+s2.price+" جنيه");
		System.out.println("3. "+s3.name+"  "+s3.price+" جنيه");
		System.out.print(" خيارك هو ");
		int c=input.nextInt();
		if(c==1) {
			tprice+=s1.price;
		System.out.println(s1.name+" تم اضافته الى طلبك");
		}
		else if(c==2) {
			tprice+=s2.price;
			System.out.println(s2.name+" تم اضافته الى طلبك");
			}
		else if (c==3) {
			tprice+=s3.price;
			System.out.println(s3.name+" تم اضافته الى طلبك");
			}
		else
			System.out.println("خيار غير صحيح");
		break;
		
		
	case 5:
		System.out.println("1."+d1.name+"  "+d1.price+" جنيه");
		System.out.println("2."+d2.name+"  "+d2.price+" جنيه");
		System.out.println("3."+d3.name+"  "+d3.price+" جنيه");
		System.out.println("4."+d4.name+"  "+d4.price+" جنيه");
		System.out.println("خيارك هو ");
		int d =input.nextInt();    	
		if(d==1) {
			tprice+=d1.price;
			System.out.println("كوب واحد من "+d1.name+" تم اضافته الى طلبك");
			}
		else if(d==2) {
			tprice+=d2.price;
			System.out.println("كوب واحد من "+d2.name+" تم اضافته الى طلبك");
			}
		else if (d==3) {
			tprice+=d3.price;
			System.out.println("كوب واحد من "+d3.name+"تم اضافته الى طلبك");
			}
		else if(d==4) {
			tprice+=d4.price;
			System.out.println("كوب واحد من "+d4.name+"تم اضافته الى طلبك");
			}
		else
			System.out.println("خيار غير صحيح");
		break;
		
			
		
	case 6:
		
		System.out.println("تم الخروج من هذه القائمة ");
		 repeat=false;
		 break;
		 
		 
		 default:
		 System.out.println("خيار غير صحيح");
	}
	
	}
	System.out.println(" السعر النهائي لطلبك هو : "+tprice+" جنيه");
	paymentarabic v1= new paymentarabic();
	System.out.println("**************");
	System.out.println(":) شكرا لاستخدامك خدمة مطعمنا عبر الانترنت ");
	}
	public static void  english() {
	Scanner input=new Scanner (System.in);	
	appetizers a1=new appetizers("Mozzarella Sticks",40);
	appetizers a2=new appetizers("Sticky Baked Chicken Wings",60);
	appetizers a3=new appetizers("Caramelized Onion Dip",30);
	appetizers a4=new appetizers("Soup",50);
	Rice r1 =new Rice ("Rice and chicken" , 150);
	Rice r2 =new Rice ("Rice and meat" , 150);
	Rice r3 =new Rice ("Rice and fish" , 150);
	Pasta p1=new Pasta ("chicken pasta", 160);
	Pasta p2=new Pasta ("Meat pasta", 200);
	Pasta p3=new Pasta ("shrimp pasta", 220);
	Sandwiches s1 = new Sandwiches("Crunchy Sandwitch" , 120);
	Sandwiches s2 = new Sandwiches("kofta Sandwitch" , 120);
	Sandwiches s3 = new Sandwiches("Shrimp Sandwitch" , 120);
	Drinks d1 = new Drinks ("Tea " , 20);
	Drinks d2 = new Drinks ("coffee " , 25);
	Drinks d3 = new Drinks ("Fresh juice" ,50 );
	Drinks d4 = new Drinks ("soda" , 25);
	int tprice=0;
	
	boolean repeat =true;
	
	
	while(repeat) {
	System.out.println("Please choose the department you want :");
	System.out.println("1.Appetizers");
	System.out.println("2.Rice meals ");
	System.out.println("3.Pasta meals ");
	System.out.println("4.Sandwitches ");
	System.out.println("5.Hot and cold drinks ");
	System.out.println("6.Exit this menu");
	System.out.print("your choice is ");
	
	int opp=input.nextInt();
	
	switch (opp) {
	
	case 1:
		System.out.println("1."+a1.name+"  "+a1.price+"LE");
		System.out.println("2."+a2.name+"  "+a2.price+"LE");
		System.out.println("3."+a3.name+"  "+a3.price+"LE");
		System.out.println("4."+a4.name+"  "+a4.price+"LE");
		    System.out.println("Your choice is ");
		    int u=input.nextInt();
		    if(u==1) {
		    	tprice+=a1.price;
			System.out.println("2 pieces of "+a1.name+"added to your order");
					
			}
		else if(u==2) {
			tprice+=a2.price;
			System.out.println("3 pieces of "+a2.name+"added to your order");
			}
		else if(u==3) {
			tprice+=a3.price;
			System.out.println("1 box of "+a3.name+"added to your order");
			}
		else if(u==4) {
    			tprice+=a4.price;
    			System.out.println("1 dish of "+a4.name+"added to your order");
		}
		else
			System.out.println("invalid option");
		    
		break;
		
		
	case 2:
		System.out.println("1."+r1.name+"  "+r1.price+"LE");
		System.out.println("2."+r2.name+"  "+r2.price+"LE");
		System.out.println("3."+r3.name+"  "+r3.price+"LE");
			System.out.println("Your choice is ");
			int a=input.nextInt();
    		if(a==1) {
    			tprice+=r1.price;
    			System.out.println(r1.name+" meal added to your order");
    			}
    		else if(a==2) {
    			tprice+=r2.price;
    			System.out.println(r2.name+" meal added to your order");
    			}
    		else if(a==3) {
    			tprice+=r3.price;
    			System.out.println(r3.name+" meal added to your order");
    			}
    		else
    			System.out.println("invalid option");
		break;
		
		
	case 3:
		System.out.println("1."+p1.name+"  "+p1.price+"LE");
		System.out.println("2."+p2.name+"  "+p2.price+"LE");
		System.out.println("3."+p3.name+"  "+p3.price+"LE");
		System.out.print(" your choice is");
		int b=input.nextInt();
		if(b==1) {
			tprice+=p1.price;
			System.out.println(p1.name+" meal added to your order");
			}
		else if(b==2) {
			tprice+=p2.price;
			System.out.println(p2.name+" meal added to your order");
			}
		else if(b==3) {
			tprice+=p3.price;
			System.out.println(p3.name+" meal added to your order");
			}
		else
			System.out.println("invalid option");
		 
		break;
		
		
	case 4:
		System.out.println("1. "+s1.name+"  "+s1.price+"LE");
		System.out.println("2. "+s2.name+"  "+s2.price+"LE");
		System.out.println("3. "+s3.name+"  "+s3.price+"LE");
		System.out.print(" your choice is ");
		int c=input.nextInt();
		if(c==1) {
			tprice+=s1.price;
		System.out.println(s1.name+" added to your order");
		}
		else if(c==2) {
			tprice+=s2.price;
			System.out.println(s2.name+" added to your order");
			}
		else if (c==3) {
			tprice+=s3.price;
			System.out.println(s3.name+" added to your order");
			}
		else
			System.out.println("invalid option");
		break;
		
		
	case 5:
		System.out.println("1."+d1.name+"  "+d1.price+"LE");
		System.out.println("2."+d2.name+"  "+d2.price+"LE");
		System.out.println("3."+d3.name+"  "+d3.price+"LE");
		System.out.println("4."+d4.name+"  "+d4.price+"LE");
		System.out.println("your choice is ");
		int d =input.nextInt();    	
		if(d==1) {
			tprice+=d1.price;
			System.out.println("One cup of "+d1.name+" added to your order");
			}
		else if(d==2) {
			tprice+=d2.price;
			System.out.println("One cup of "+d2.name+" added to your order");
			}
		else if (d==3) {
			tprice+=d3.price;
			System.out.println("One cup of "+d3.name+"added to your order");
			}
		else if(d==4) {
			tprice+=d4.price;
			System.out.println("One cup of "+d4.name+"added to your order");
			}
		else
			System.out.println("invalid option");
		break;
			
		
	case 6:
		
		System.out.println("This list has been exited ");
		 repeat=false;
		 break;
		 
		 
		 default:
		 System.out.println("invalid option");
	}
	}
	
	System.out.println("The total cost of your order is : "+tprice+ " LE");
	paymentmethod z1= new paymentmethod();
	System.out.println("**************");
	System.out.println("Thanks for using our resturant online service :) ");
	}
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	

