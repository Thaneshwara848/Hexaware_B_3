class A 
{
	A()
	{
	}
	public void abc()
	{
		System.out.println("HI ");
	}
}
class B extends A 
{
	B()
	{
	}
	public void abc()
	{
		System.out.println("Hello  : everything must be same signature ");
	}
}
class Demo2
{
	public static void main(String args[])
	{
	 	B b =new B(); 
		b.abc();
	}
}
//a constructor cannot be overridden 
//same method with same signature (public void abc ()) in child class 


