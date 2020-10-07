import java.util.Scanner;

public class Searchnumberinarray {
 static int count=0;
 static int temp=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={2,5,5,30,45,23,56,689,44};

System.out.println("Enter ur number");
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();

int lenght = 0;
for(int i=0;i<a.length;i++){
	if(b==a[i]){
		
		count++;
	temp=i;
	}
}if(count==0){
	
	System.out.println("not on array");
	
}	else{
	System.out.println("ur number in array");
}
System.out.println("index value of:"+ temp);

System.out.println("repeted count is"+ count);

	
	

	}

}
