class A
{
	A()
	{	
		System.out.println("A");	
	}	
	void abc()
	{
		System.out.println("A methd sone logic ");
	}
}
abstract  class B 
{
	B()
	{
		
		System.out.println("B");
	}
	abstract void abc();
	void xyz()
	{
	}
}
class Demo1
{
	public static void main(String args[])
	{
		A a= new A();
		//B b =new B();
		a.abc();
		//b.abc();	
	}
}
// 		class 					abstract class 
// obj 		A a =new A();				NO 
//		only have non abstract method 			it can have both 
	abstract void abc();
		hinfing the implemantaion : 
		how 
				make methos as abstract 
					if my methd is abstract also my class ust be abstract 
						 if my lass is abstract , object cant be create 









