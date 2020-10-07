import java.util.Scanner;

public class fabnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a value for fobbo");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("enter two values");
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println("enter two values : "+b+" "+c);
			
			for(int i=0;i<a;i++){
				int d=b+c;
				c=d;
				b=c;
				System.out.println(d);
				
			}
			
		}
	}


