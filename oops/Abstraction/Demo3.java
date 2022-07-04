abstract  class RBIBank
{
	// mandatory ruls and regualations method 
	abstract void loan();
	abstract void account();
	abstract void OT();
	abstract void ATM();
	void aaa(){}
	void xxx(){}		
	int a;// 0 
	// COnstructor 
	RBIBank()
	{
	}
}
class SBI extends RBIBank
{
	void ATM(){}
	void  OT(){}
	void account(){}
	void  loan(){  System.out.println("5 % ");}
}
class Axix extends RBIBank
{
	void ATM(){}
	void  OT(){}
	void account(){}
	void  loan(){  System.out.println("10 % ");}
}
 public  class Demo3
{
	public static void main(String args[])
	{
		
	}
}