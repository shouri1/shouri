
public class ANU {
	int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    void constraction(int i,String n){  
    id = i;  
    name = n;  
    System.out.println(id+" "+name);
    }  
   //creating three arg constructor  
  void anu1(int i,String n,int a){  
  id = i;      name = n;  
  age=a;  
   System.out.println(id+" "+name+" "+age);
 }  
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ANU s1 = new ANU();  
		s1.constraction(10,"anu");
		
	
		s1.anu1(10,"anu",10);
		     
	}

}
