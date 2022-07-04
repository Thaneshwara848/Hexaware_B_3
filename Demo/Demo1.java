//final class A , we cant inherite 
 class A 
{
	int a=100;	
	int b=200;
	final void m1(){ System.out.println("Hi A class");}
}
class B  extends A 
{
	final int b=500;
	//void m1(){ System.out.println("Hi B class");} we cant able to over  ride 
}
class Demo1
{
	public static void main(String args[])
	{
		B b1 =new B();
		b1.m1();
		System.out.println(b1.b);
		//b1.b=10000;
		//System.out.println(b1.b);		
	}
}	

// variabl e : cannot assign a value to final variable bfinal int b=500;
// method: cannot override m1() in A
// class i cant inherit 
