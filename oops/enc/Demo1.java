class A
{
	static void main()
	{
		System.out.println("main method with static ");
	}
}
class B
{

	void abc()
	{
		System.out.println("Hi Method ....!");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		B b = new B();
		b.abc();	

		//A a =new A();
		//a.xyz();
		A.main();		// class_name . method name 
				// static , no need of creating the object
	}

}