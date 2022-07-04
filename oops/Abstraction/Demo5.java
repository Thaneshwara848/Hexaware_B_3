class A
{
	A(){}
	int a;
}
abstract class B 
{
	B(){}
	int b;
}
interface I 
{
	//I(){}
	//int i; we have assign 
	int x=100;
}
interface J 
{
}
interface K  extends J , I 
{
}
class Demo5
{
	public static void main(String args[])
	{
		//A a =new A(); yes 
		//B b =new B();no
		//I i=new I();
	}
}