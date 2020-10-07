package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Equalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc=new Scanner(System.in);
		String test=sc.nextLine();
		System.out.println("Enterd string value" +test);
		int test1=sc.nextInt();
		System.out.println(test1);
		if(test=="anu"){
			System.out.println("both values are equal");
		}else{
			if(test1==321){
				System.out.println("both are eual");
			}else{
				System.out.println("not eual");
			}
		}*/
		
		String new1="testvalue";
		System.out.println(new1);
		
	      ArrayList<String> list = new ArrayList<>();
	      list.add("anu");
	      list.add("testvalue");
	      list.add("NEW");
	     for( String str : list){
	    	 if(str.equals(new1)){
	    		 System.out.println("matched");
	    	 }else{
	    		 System.out.println("not matched");
	    	 }
	     }
	     
	}}


