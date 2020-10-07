import java.util.Scanner;

public class factorial {
	static int b=1 ,c;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the factorial number :");
c=sc.nextInt();
		for(int i=1;i<=c;i++){
	
	 b=i*b;
	
}System.out.println("Factorial numberc is :"+" of c "+b);
factorial f=new factorial();
f.display();
	}
  void display(){
	
	System.out.println("with out object creation");
}
}
