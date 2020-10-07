
public class recurstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=1;
print(number);

	}

	private static void print(int number) {
		// TODO Auto-generated method stub
		if(number<=100){
		System.out.println(number);
		print(number+1);
	
	}
	}
}
