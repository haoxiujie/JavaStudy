package _homework07_1;

import java.util.Scanner;

public class Main {
	//判断是否为质数：
	public static boolean isPrime (int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		System.out.print(n);
		return true;
	}
	
	public static void noPrime(int n)
	{	
		if(isPrime(n))
		{			
			return;
		}
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+"x");
				noPrime(n/i);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int n = in.nextInt();
		System.out.print(n+"=");
		//判断是否为质数
		if(!isPrime(n))
		{
			noPrime(n);
		}
		in.close();				
	}

}
