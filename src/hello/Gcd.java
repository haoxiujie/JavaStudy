package hello;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
//		int gcd = 1;
//		for (int i = 2; i<=a && i<=b ; i++ )
//		{
//			if (a % i == 0 && b % i == 0 )
//			{
//				gcd =i;
//			}
//		}
		int oa=a,ob=b;
		while ( b != 0)
		{
			int r = a % b;
			System.out.println("a="+a+",b="+b+",r="+r);
			a = b;
			b = r;
		}
		System.out.println(oa+"和"+ob+"的最大公约数是"+a);
		in.close();
	}

}
