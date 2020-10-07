
public class armstrong  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int n=252;
		int temp=0,a,c=0;
		temp=n;
		while(n>0){
			
			a=n%10;
			n=n/10;
			c =c+(a*a*a);
			
		}	if(temp==c){
				System.out.println("armstrong number");
			}
			else{
				System.out.println("not an armstrong");
			}
		}
	}


