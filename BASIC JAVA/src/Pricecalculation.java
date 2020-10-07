import java.util.Scanner;

public class Pricecalculation {
 static double p;
 static int p1,p2;
 static int Base,ma;

  static double finalprice;
  static double finalprice1;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		System.out.println("Enter Your quntatity");
		Scanner sc=new Scanner(System.in);
		int quntatity=sc.nextInt();
		System.out.println("Your quntatity is"+ quntatity);
		
		System.out.println("Enter Your regular price type flatrate of per pices");
		Scanner sc1=new Scanner(System.in);
		String pricetype1=sc1.nextLine();
		
		System.out.println("Enter Your price");
		Scanner sc2=new Scanner(System.in);
		int price=sc2.nextInt();
		

		if(pricetype1.equalsIgnoreCase("flatrate")){
		 p=price*1;
		System.out.println("flatrate is"+ p );
		}else{
		 p=price*quntatity;
		count++;
		System.out.println("price is"+ p);
		
		}
		
		
		System.out.println("Do u want to Enter the groups price");
		Scanner sc22=new Scanner(System.in);
		String price22=sc22.nextLine();
		
		if(price22.equalsIgnoreCase("yes")){
	System.out.println(" Enter the  price");
	Scanner sc2234=new Scanner(System.in);		
	int price909=sc2234.nextInt();
	System.out.println("Enter Your price type flatrate of per pices");
	Scanner sc109=new Scanner(System.in);
	String pricetype109=sc109.nextLine();
	
	if(pricetype109.equalsIgnoreCase("flatrate")){
		 p2 = price909*1;
		 System.out.println("flatrate is"+ p2 );
		
	}else{
		 p2=price909*quntatity;
		count++;
		System.out.println("price is"+ p2);
		
		}
			}

else{

		
	System.out.println("Do u wnat to Enter Your Markupprice");

		Scanner sc3=new Scanner(System.in);
		String ma=sc3.nextLine();
		System.out.println(ma);

		 if(ma.equalsIgnoreCase("yes")){
				System.out.println("enetr ur Markupprice");
				Scanner sc4=new Scanner(System.in);
				int ma1=sc4.nextInt();
				finalprice= p/100;
				System.out.println(finalprice);
				 finalprice1=finalprice*ma1;
				 System.out.println(finalprice1);
					p=p+finalprice1;
					
					System.out.println("includes markup"+ p);
		 }else {
			 
			 System.out.println("with out markup price"+ p);
		 }
		 
		 
		 System.out.println("Do u wnat to Enter Your Base price");

			Scanner sc5=new Scanner(System.in);
			String mac=sc5.nextLine();
			
			if(mac.equalsIgnoreCase("yes")){
		
				System.out.println("Enter Your Base price");
				Scanner sc6=new Scanner(System.in);
			 Base=sc6.nextInt();
			 if(p<Base){
					System.out.println("Ur final  is:" +Base);
				}
	 }
			else{
		
				System.out.println("Ur final price is:" +p);
			
	 }
			
		

	}
		
	

}}
