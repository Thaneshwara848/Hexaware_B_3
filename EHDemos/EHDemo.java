import java.util.Scanner;
import java.io.*;
class EHDemo
{
	public static void main(String args[]) 
	{
		 String name="Thanesh";
		//name=null; NullPointerException 
		System.out.println(name.length());

		// Arithementic Exception 
		String val="10A";

		//System.out.println(Integer.parseInt(val));	 NumberFormatException 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age =sc.nextInt();	
		
		System.out.println("My Age is : "+ age );// InputMismatchException

	}
}







compile time exception / checked exception  :
		it will cheked at time of compilation 
	FIleNotFOund Excerption 
	SQLException 
	

run time exception / uncheked exception 

		this will check at the run time 

	 NullPointerException 
	ArithematicException 
	NumberFOrmateException 
	InputMissmatchExcetion 


how to handle ? 
	2 ways ? 
		1) throws : 
			we have to pass our exception to the caller method  
		2) try and catch 
			no need of passing anywhere 















