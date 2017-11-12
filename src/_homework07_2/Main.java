package _homework07_2;

import java.util.Scanner;

public class Main {
	public static boolean isPerfectNum(int n)
	{
		int add = 0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				add+=i;
			}
		}
		if(add==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void scope(int n,int m)
	{
		boolean no1 = true;
		for(;n<m;n++)
		{
			if(isPerfectNum(n))
			{
				if(!no1)
				{
					System.out.print(" ");
				}
				System.out.print(n);
				no1=false;
			}
		}
		if (no1)
		{
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		scope(in.nextInt(),in.nextInt());
		in.close();
	}

}
