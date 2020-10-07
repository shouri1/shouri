
 class SingleInheritance {

	void test()
	{
		System.out.println("Prtint extendsinteritance");
	}}
	class SingleInheritance1 extends SingleInheritance
	{
		void dark()
		{
			System.out.println("SingleInheritance11");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance1 a= new SingleInheritance1();
		a.test();
		a.dark();
	}
	}

