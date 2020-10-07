package example;

import java.util.Scanner;

import javax.management.StringValueExp;

public class Partice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String anu=sc.nextLine();
		
		String[] anu1=anu.split(" ");
		
		for(int i=0;i<anu1.length;i++){
			for(int j=0;j<anu1[i].length();j++){
				String temp=anu1[i];
				int lenght=anu1[i].length()-1;
				if(j==0){
					String ch=String.valueOf(temp.charAt(j));
					
				}if(lenght==j){
					System.out.println(" ");
				}
					else{
						System.out.print(temp.charAt(j));
						if(j==lenght)
						{
							System.out.print(" ");
						}
				}
				
				
			}
		}
		
		
	}

}
