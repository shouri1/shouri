
public class countvowelsandconsonant {

	static int count=0;
	static int temp=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String vowelsandconsonant="Anushatecra sloutions";
int lenght=vowelsandconsonant.length();
System.out.println("Lenght of the string is "+lenght);
for(int i=0;i<=lenght-1;i++){
	if(vowelsandconsonant.charAt(i)=='a'||vowelsandconsonant.charAt(i)=='e'||vowelsandconsonant.charAt(i)=='i'||vowelsandconsonant.charAt(i)=='o'||vowelsandconsonant.charAt(i)=='u'){
//System.out.print(vowelsandconsonant.charAt(i));
count++;

}
else{
	temp++;
	
}}
System.out.println("vowels are in given string:"+ count);
System.out.println("consonant are in given string:"+ temp);
	}

}
