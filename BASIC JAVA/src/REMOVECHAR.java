
public class REMOVECHAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s="Tecra systems";
		
		
		int length=s.length();
		
		String a[]=s.split("");
		
		
		for(int i=0;i<=length-1;i++)
		{
			for(int j=i+1;j<=length-1;j++)
			{
			if(a[i].equalsIgnoreCase(a[j]))
			{
				a[j]="@";
			}
			}	 
			if(a[i].equalsIgnoreCase("@"))
			{
			 a[i]=a[i].replace("@", "");
			}
		
			System.out.print(a[i]);
			}
      }
  
	}
	
	


