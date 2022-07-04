import java.util.Scanner;
class A
{
	Scanner sc =new Scanner(System.in);
	A()
	{	
		
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				continue;
			}
			
			System.out.println(i);	
			
		}
		System.out.println("While Demo ....!");

		int j=1;
		while(j<=10)
		{
			System.out.println(j);	
			j++;
		}

		System.out.println("Do While Demo ....!");

		int k=1;
		do 
		{
			System.out.println(k);	
			k++;
		}while(k<=10);

	}
}
class Demo7
{
	public static void main(String args[])
	{
		A a =new A();
	}

}