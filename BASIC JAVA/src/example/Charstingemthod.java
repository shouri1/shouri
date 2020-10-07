package example;

public class Charstingemthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String anu="anusha";
		char c=anu.toUpperCase().charAt(3);
		
		for(int i=0;i<anu.length()-1;i++){
			if(i%2!=0){
				System.out.println("Char at "+i+" place "+anu.charAt(i));
			}
		}
		
	}

}
