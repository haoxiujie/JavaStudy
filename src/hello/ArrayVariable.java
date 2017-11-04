package hello;

import java.util.Scanner;

public class ArrayVariable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		int[] scores = {87, 98, 69, 54, 65, 76, 87, 99, 100, 103};
//		System.out.println(scores.length);
//		for( int i=0 ; i<scores.length ;i++)
//		{
//			System.out.print(scores[i]+" ");
//		}
		
//		int[] a=new int [10];
//		a[0]=5;
//		int[]b= a;
//		System.out.println(a);
//		b[0]=16;
//		System.out.println(a[0]);
		
		int[]a= {1,2,3,4,5};
		int[]b= new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i] = a[i];
		}
		boolean isEqu = a.length==b.length;
		for (int i=0; i<b.length ; i++)
		{
			if( a[i] != b[i] )
			{
				isEqu = false;
				break;
			}
		}
		System.out.println(isEqu);
		
		in.close();
	}

}
