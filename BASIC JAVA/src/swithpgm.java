import java.util.Scanner;

public class swithpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

char operator;
		
		int number1 ,number2,number3,result;
		
		System.out.println("enetr any operator like(*,+, -): ");
		Scanner sc=new Scanner(System.in);
	operator=sc.next().charAt(0);
	
	System.out.println("enetr ur numbers");
int x=number1=sc.nextInt();
int b=number2 =sc.nextInt();
int c=number3 =sc.nextInt();
switch(operator)
{
case '+':


if(number1+number2==20){
	System.out.println( "result : "+  "true");}
	else{
		System.out.println("false");
	}
break;
case '-':
	 int d=x+b*c;
	
	System.out.println("result "+ d);
	break;
default:
System.out.println("end");
}
}




}
 
	
	
	


