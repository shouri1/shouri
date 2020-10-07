
public class Staticmethyodcalling {

	static int d,a=2,b=3,c=4;;
	static int addition(){
		
		d=a+b+c;
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethyodcalling.addition();
		System.out.println(d);
	}

}
