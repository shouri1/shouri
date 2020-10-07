package example;

public class Concatmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="anusha";
		String s2="raavi";
		s1.concat("test");
		String s3 = s1.concat(" ").concat("test");
		System.out.println( s3);
				
		String s4=s1.concat(" ").concat(s2).concat("@").concat(s1).concat("$").concat(s3);
		System.out.println(s4);
	}

}
