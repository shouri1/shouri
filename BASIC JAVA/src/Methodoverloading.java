
public class Methodoverloading {

	
	int a;
	static int d;
static int x;
static int b;
	void run( int a,int x){
		

		System.out.println(d);
	}
	 static void run(int d,int x,int z){
		b=d+z;
		System.out.println("Three");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading obj=new Methodoverloading();
		obj.run(10, 34);
		
	}

}
