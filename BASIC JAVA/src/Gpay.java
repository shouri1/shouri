import java.util.Random;
import java.util.Scanner;

public class Gpay {
	static int  randomNo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
 
 System.out.println("Enter ur send money");
 
Scanner sc=new Scanner(System.in);
int ammount=sc.nextInt();
if(ammount>0 && ammount<=100){
	


			int b=randomNo =rnd.nextInt(10);
			System.out.println("u enrned a cashback:" +randomNo);
	

}if(ammount>100 && ammount<=1000){
	
	int b=randomNo =rnd.nextInt(1000);
	System.out.println("u enrned a cashback:" +b);
}

	}public static void r()
	{
		Random rnd = new Random();
		randomNo =rnd.nextInt(1000);
	}

}
