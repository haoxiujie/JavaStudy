package _homework03_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int odd = 0;//ÆæÊý
		int even = 0;//Å¼Êý
		int a = in.nextInt();
		while(a != -1)
		{
			if ( a%2 == 0)
			{
				even = even + 1;
			}
			else
			{
				odd = odd + 1;
			}
			a = in.nextInt();
		}
		System.out.println(odd+" "+even);
		
		in.close();
	}

}
