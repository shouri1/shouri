import java.util.Arrays;

public class Annagramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Brag";
String s2="Grab";

String Str1 = s1.toLowerCase();
String str2 = s2.toLowerCase();
if(Str1.length()==str2.length()){
	char[] string1 = Str1.toCharArray();  
    char[] string2 = str2.toCharArray();  
    
    Arrays.sort(string1);  
    Arrays.sort(string2);
    if(Arrays.equals(string1, string2) == true) {  
        System.out.println("Both the strings are anagram");
}
}
	else{
		System.out.println("Both the strings not a  anagram");
	}

}}
