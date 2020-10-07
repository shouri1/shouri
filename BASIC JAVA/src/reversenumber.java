import java.util.Scanner;

public class reversenumber {
	 static int n,r,a,sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("Enter the reverse value:");
int i=sc.nextInt();
while(i!=0){
	
	r=i%10;
	sum=sum*10+r;
	i=i/10;
	
}
	
System.out.println(sum);
}



	}


