
class MyEmp
{
	MyEmp()
	{
		System.out.println("HI My EMp Class ");
	}
	void display()
	{
		System.out.println("HI Method ");
	}	
}
class Demo2 
{
	public static void main(String args[])
	{
		MyEmp e = new MyEmp();
		//MyEmp e1 = new MyEmp();
		e.display();
		e.display();
		e.display();	
		e.display();
		e.display();
		e.display();
	}
}