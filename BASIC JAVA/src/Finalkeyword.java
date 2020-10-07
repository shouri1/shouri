
public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	int a=10;
	int b=0;
	int c=a/b;
}
catch(ArithmeticException e)
{
	System.out.println(e);
	
}
finally{
	System.out.println("executed finally");
}
System.out.println("rest of code");
	}

}
