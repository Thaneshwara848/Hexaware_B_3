import java.util.Scanner;
class A
{
	Scanner sc =new Scanner(System.in);
	A()
	{	
		System.out.println("1 ) Kannda :");
		System.out.println("2 ) English :");
		System.out.println("3 ) Marati :");
		System.out.println("4 ) telgu :");
		System.out.println("5  ) Tamil :");
		System.out.println("Enter the Choce :");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				 System.out.println("You Choosen Kannda ");	
				break; 
			case 2:
				 System.out.println("You Choosen English ");	
				break; 
			case 3:
				 System.out.println("You Choosen marati ");	
				break; 
			default : 
				 System.out.println("You Choosen Hindi ");	
				break; 
			case 4:
				 System.out.println("You Choosen Telgu ");	
				break; 

			case 5:
				 System.out.println("You Choosen tamil ");	
				break; 	
		}
	}
}
class Demo6
{
	public static void main(String args[])
	{
		A a =new A();
	}

}
				 till 3: 45 break 
