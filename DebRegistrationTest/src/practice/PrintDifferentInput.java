package practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrintDifferentInput 
{

	@Test
	public void testPrint()
	{
		System.out.println("Enyter input");
		
		Scanner scan=new Scanner(System.in);
		//String n=scan.nextLine();
		int N=scan.nextInt();
//		double d=scan.nextDouble();
//		System.out.println(s);
//		System.out.println(a);
//
//		System.out.println(d);
		//char m=*
		for(int i=1;i<=10;i++)
		{
			 System.out.printf("%d x %d = %d%n", N, i, N*i);
			 //System.out.printf("%-15s%03d\n",s1,x);
			//System.out.println(i);
		}
		
		//2 * 1=2
		
		
	}
	
}
