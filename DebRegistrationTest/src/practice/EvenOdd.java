package practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class EvenOdd
{

	@Test
	public void evenOddTest()
	{
		System.out.println("Enter N :");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//System.out.println(N);
		
		if(N%2==0)
		{
			if((2<=N && N<5) ||(N>20) )
			{
				System.out.println("Not Weird");
			}else
			{
				System.out.println("Weird");
			}
			//System.out.println("Even : "+N);
		}else
		{
			System.out.println("Weird");
			//System.out.println("Odd : "+N);
		}
	}
}
