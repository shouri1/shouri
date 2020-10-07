
public class constraction {
	int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    constraction(int i,String n){  
    id = i;  
    name = n;  
    System.out.println(id+" "+name);
    }  
   //creating three arg constructor  
  constraction(int i,String n,int a){  
  id = i;      name = n;  
  age=a;  
   System.out.println(id+" "+name+" "+age);
 }  
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constraction s1 = new constraction(111,"Karan");  
		constraction s2 = new constraction(222,"Aryan",25);  
		     
	}

}
