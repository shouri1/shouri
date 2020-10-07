import java.util.Scanner;

public class arraystorevallueandasscendingorder {
	static int a[]=new int[80];
	static int  temp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner sc=new Scanner(System.in);
System.out.println("Please enter the size of arry: =");
int c=sc.nextInt();
for(int i=0;i<c;i++){
	System.out.println("Enter the array vales :");
	a[i]=sc.nextInt();
}
/*for(int i=0;i<c;i++){
	System.out.println("values are :"+a[i]);
		
}*/
for(int i=0;i<=c;i++){
	for(int j=0;j<=c;j++){
		if(a[i]<=a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]= temp;
		}
	}
}
for(int i=0;i<c;i++){
	System.out.println("values are :"+a[i]);
	
}
	}

}
