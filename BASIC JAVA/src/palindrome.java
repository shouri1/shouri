
public class palindrome {
static String b="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="RETTER";
int lenght=s.length();
String[] a=s.split("");


for(int i=lenght-1;i>=0;i--)
{
	b=b+s.charAt(i);
}
if(s.equalsIgnoreCase(b))
{
	System.out.println("it's a palindrome");
	}
else
	{
		System.out.println("Not a plaindrome");
	}
	}

}
