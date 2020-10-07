import java.util.Scanner;

public class square {
	
	static int c,a,sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the square number :");

		c=sc.nextInt();
		for(int i=1;i<=c;i++){
			 a=(i*i);
			 
	System.out.println(a);
sum=sum+a;
}System.out.println("squre numberc sum is:"+ sum);
	}

}


