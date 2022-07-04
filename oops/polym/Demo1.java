class A 
{
	int a =100;
	A()
	{
		System.out.println("A()");
	}
	A(int a )
	{
		// logic 
	}
	A(int a, String name )
	{
		//logic 
	}
	A(int a , int b , String name )
	{
		// logic 
	}
	void draw()
	{
	}
	void draw(int r )
	{
		// are of circle : Pi * r * r 
	}
	 void draw(int l , int b )
	{
		l * b ;
	}
}
class Demo1
{
	public static void main(String args[])
	{
	 	A a =new A();
		A a1=new A(100);
		A a2=new A(1000,"Thanesh");
		A a3=new A(100,200,"Suresh");
		a.draw(100);
		a.draw(100,200);
	
	}
}
//same constructr + muiltple time  + with dif dif paramanert + in same class = costructor over loding 
//same methd + muiltple time  + with dif dif paramanert + in same class = method over loding 
