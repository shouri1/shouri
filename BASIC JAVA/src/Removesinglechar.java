import java.util.Scanner;

public class Removesinglechar {
public String c= null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter ur string");
		Scanner sc=new Scanner(System.in);
		String a = sc.next();
		System.out.println(charRemoveAt(a, 3));
		
	
		
	}

	private static char[] charRemoveAt(String a, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
/*public class Removesinglechar {  
    public static void main(String[] args) {  
              String str = "India is my country";  
              System.out.println(charRemoveAt(str, 7));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}*/