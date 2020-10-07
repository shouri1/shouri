
public class Nestedtryblocks {
static int a;
	public static void main(String[] args) {
		try{
			try{
			 a=0;
			int b=2;
			int c=3;
			int d=c/a;
			
		}catch(ArithmeticException e)
			{
			System.out.println("Arthimatic");
			
		}
			try
			{
			
 			String s=null;
 			s.length();
		}
		catch(NullPointerException e)
			{
			
			System.err.println("this is null pomter");
			
		}}
			catch(Exception e)
			{
			
			System.out.println("Parent Exeption");
			
			}
		System.out.println("relatede code");

	
		}

}