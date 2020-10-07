

package example;
import java.util.Scanner;

public class StringFormatter {
public static String anu="";

public static void main(String[] args) {
// TODO Auto-generated method stub
//String a="anusha raavi";
	String temp="";
System.out.println("enter capitalize string is");
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
int lenght=a.length();
String c[]=a.split(" ");
for(int i=0;i<c.length;i++){

	for(int j=0;j<c[i].length();j++)
	{
		temp=c[i];
		int temp1=temp.length()-1;
		if(j==0)
		{
			
	String ch=String.valueOf(temp.charAt(j));
	System.out.print(ch.toUpperCase());
	if(j==temp1)
	{
		System.out.print(" ");
	}
	}
		else
		{
			System.out.print(temp.charAt(j));
			if(j==temp1)
			{
				System.out.print(" ");
			}
		}

}

}

}

}