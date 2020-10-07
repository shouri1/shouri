
public class StaticKeyword {

	int rollno;
	int boodgroup;
	String name;
	static String company="anu2";
	StaticKeyword(int r,int b,String s){
		rollno=r;
		boodgroup=b;
		name=s;
		System.out.println(rollno+" " +boodgroup +" " +name +" "+ company);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword a=new StaticKeyword( 123,23,"anu");
		
	}

}
