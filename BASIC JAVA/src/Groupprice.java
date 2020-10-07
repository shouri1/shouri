import java.util.Scanner;

public class Groupprice {

	static double p,p5;
	 static int p1,p2,ma112,p3,p4;

	 static int Base,ma,finalprice134,finalprice1345;

	  static double finalprice;
	  static double finalprice1,finalprice19,finalprice09,finalprice899,finalprice1899,finalprice66,finalprice166;
	  
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
			System.out.println("perprice is"+ p);
			
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
			
			}}
		
else{
		System.out.println("Do u wnat to Enter Your Markupprice");

		Scanner sc3=new Scanner(System.in);
		String ma66=sc3.nextLine();
		System.out.println(ma66);

		 if(ma66.equalsIgnoreCase("yes")){
				System.out.println("enetr ur Markupprice");
				Scanner sc466=new Scanner(System.in);
				int ma166=sc466.nextInt();
				finalprice= p/100;
				System.out.println(finalprice66);
				 finalprice166=finalprice66*ma166;
				 System.out.println(finalprice166);
					p=p+finalprice166;
					
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
		
				if(p==p2){
					System.out.println("final price;" + p);
				}else{
			
			if (p<p2){
				
				System.out.println("Do u wnat to Enter Your Markupprice");

				Scanner sc33=new Scanner(System.in);
				String ma33=sc33.nextLine();
				System.out.println(ma33);

				 if(ma33.equalsIgnoreCase("yes")){
						System.out.println("enetr ur Markupprice");
						Scanner sc44=new Scanner(System.in);
						int ma112=sc44.nextInt();
						finalprice09= p/100;
						System.out.println(finalprice09);
						 finalprice19=finalprice09*ma112;
						 System.out.println(finalprice19);
							p5=p+finalprice19;
							
							System.out.println("includes markup"+ p5);
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
				
		
				
			else{
				
			}if (p<p2){
				
				
				System.out.println("Do u wnat to Enter Your Markupprice");

					Scanner sc37=new Scanner(System.in);
					String ma57=sc37.nextLine();
					System.out.println(ma57);

					 if(ma57.equalsIgnoreCase("yes")){
							System.out.println("enetr ur Markupprice");
							Scanner sc46=new Scanner(System.in);
							int ma18=sc46.nextInt();
							finalprice899= p/100;
							System.out.println(finalprice899);
							 finalprice1899=finalprice899*ma18;
							 System.out.println(finalprice1899);
								p=p+finalprice1899;
								
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
					
			

	else{

			
		System.out.println("Do u wnat to Enter Your Markupprice");

			Scanner sc3=new Scanner(System.in);
			String ma=sc3.nextLine();
			System.out.println(ma);

			 if(ma.equalsIgnoreCase("yes")){
					System.out.println("enetr ur Markupprice");
					Scanner sc4=new Scanner(System.in);
					int ma123=sc4.nextInt();
					finalprice1345= p2/100;
					System.out.println(finalprice1345);
					 finalprice134=finalprice1345*ma123;
					 System.out.println(finalprice134);
						p3=p2+finalprice134;
						
						System.out.println("includes markup"+ p3);
			 }else {
				 
				 System.out.println("with out markup price"+ p2);
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
			
		

				}


		}}

	
