package example;

import java.util.Scanner;

public class Repetadwordinstring {
	static int count ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String anu1="Anusha raavi";
int count = 0;

int lenght=anu1.length();
for(int i=0;i<lenght;i++){
	if(anu1.charAt(i)=='a'){
		count++;
		
	}}
	System.out.println("repeted word a is :" +count);*/
		System.out.println("enetr a string");
		
		Scanner sc=new Scanner(System.in);
		String anu=sc.nextLine();
		System.out.println("enetr a search letter");
		String anu1=sc.nextLine();
		String an2=anu1.toUpperCase();
		char c=an2.charAt(0);
		char c1=an2.toUpperCase().charAt(0);
		for(int i=0;i<=anu.length()-1;i++){
			if(anu.charAt(i)==c||anu.charAt(i)==c1){
			
	count++;
			}

			}
		System.out.println("repated vale"+ c +":"+count);	
		}
}


	


