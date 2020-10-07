import java.util.Scanner;

public class Stringreversepar {

	public String anu="";
	public  int i;
	
	
public void anu(){
		String a;
		System.out.println("enter ur string");
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		System.out.println("ur string is");
		int length=a.length();
		System.out.println(length);
		
	String b[]=a.split("");
	//System.out.println(b[1]);
	for(int i=length-1;i>=0;i--){
		System.out.println(b[i]);
		//anu=anu+b[i];
		
		
	}
	//System.out.println(b[i]);
	if(a.equalsIgnoreCase(b[i])){
		System.out.println("palindrome");
	}else{
		System.out.println(" not a pali");
	}

	
	
		}
		
		
		
		


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stringreversepar s=new Stringreversepar();
		s.anu();
		

	}
	

}
