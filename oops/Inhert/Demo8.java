class A
{
	A()
	{
		this(100);
		System.out.println(" A ()");
	}
	A(int  a )
	{
		System.out.println(" A (int a )");
	}	
}

class Demo8
{	
	public static void main(String args[])
	{
	
		A a= new A();	
	}

}
