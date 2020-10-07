
class MethodOverriding {
 int a=10;
 String name="anusha";

    void test()
    {
    	System.out.println("MethodOverriding is ready");
   
    }
} class MethodOverriding1 extends MethodOverriding
{
	  public void test()
	  {
		System.out.println("MethodOverriding1 is ready");
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverriding1 a11=new MethodOverriding1();
		//MethodOverriding a1=new MethodOverriding();
		a11.test();
		//a1.test();
		
	}

}
