package example;

import java.util.Scanner;

public class Reversestingforevery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String anu=sc.nextLine();
		
		String[] an1=anu.split(" ");
		for(int i=0;i<an1.length;i++){
			for(int j=an1[i].length()-1;j>=0;j--){
				String temp = an1[i];
				int temp1=an1.length-1;
				System.out.print(temp.charAt(j));
			if(j==0){
				System.out.print(" ");
			}
				
			}
			
		}
	}

}
