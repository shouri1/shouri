
public class countcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		 String anu = "anushatecrasytesms";
		 int lenght=anu.length();
		for(int i=0;i<=lenght-1;i++){
			if(anu.charAt(i)==' '){
	
		count++;
		lenght=lenght-count;
		}
			
	
		}	System.out.println(lenght);
	}
}