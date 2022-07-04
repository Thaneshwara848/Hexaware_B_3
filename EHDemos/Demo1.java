import java.util.Scanner;
class A
{
	Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.print("ENter A values  : ");
		int a =sc.nextInt();

		System.out.print("Enter B Value : ");
		int b=sc.nextInt();
		try
		{
			int c =a/b ;
			System.out.println("Result is : "+ c );
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" number / 0 is not posible , please enter the valid number ");
		} 
	}
}
class Demo1
{
	public static void main(String args[])
	{
		A a= new A();
	}
}