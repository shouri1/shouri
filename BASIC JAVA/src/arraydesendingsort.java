import java.util.Scanner;

public class arraydesendingsort {
	 static int b[]=new int[100];
	 static int temp;
	 char c='a';
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enetr the size of the array");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	
	for(int i=0;i<=a;i++){
		System.out.println("enetr the index values");
		b[i]=sc.nextInt();
		
	}

for(int i=0;i<=a;i++){
	for(int j=0;j<=a;j++){
		if(b[i]>=b[j]){
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			
		}
		
	}
}
for(int i=0;i<a;i++){
	System.out.println("values are :"+b[i]);
	}
}}
