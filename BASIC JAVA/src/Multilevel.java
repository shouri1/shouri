
class account {

	void deposit(){
		System.out.println("deposit");
	}}
	
	class sbi extends account
	{
		void balance(){
			System.out.println("balance");
		}
	}
	class icic extends sbi
	{
		void withdraw(){
			System.out.println("withdraw");
		}
	}class Multilevel extends icic
	{
		void check(){
			System.out.println("checking");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel b=new Multilevel();
		b.balance();
		b.check();
		b.withdraw();
		b.deposit();
	}
	}


