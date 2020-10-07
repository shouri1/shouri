import java.util.Scanner;

public class ageusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=18;
	String x;
	Scanner sc=new Scanner(System.in);

	System.out.println("yes or no");
	x=sc.next();
		System.out.println("enetr ur age");
		//Scanner sc=new Scanner(System.in);
  int b=sc.nextInt();
 
 
  while(x.equalsIgnoreCase("yes"))
  {
  if(b>=a){
	  
	  System.out.println("ur eligible for vote");
  }else{
	  System.out.println("ur not eligible for vote");
  }
System.out.println("yes or no");
x=sc.next();
if(x.equalsIgnoreCase("yes"))
{
System.out.println("enetr ur age");
a=sc.nextInt();
}
	
}

	}
	}
