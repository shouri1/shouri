package example;
import java.util.Scanner;
public class Reverseparticularsting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String a=sc.nextLine();
		String[] c=a.split(" ");
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length();j++){
				String temp = c[i];
				int temp1=temp.length()-1;
				if(j==0)
				{
					String ch=String.valueOf(temp.charAt(j));
					System.out.print(ch.toUpperCase());
				if(j==temp1)
				{
					System.out.print(" ");
				}
				}else{
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