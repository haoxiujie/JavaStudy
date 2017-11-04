package _homework04_2;

import java.util.Scanner;

public class Main {
	public static int on;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n<0)
		{
			System.out.print("fu ");
			n *= -1; 
		}
		on=n;
		number(n);
		//为方便从右往左读，所以先将数字逆序，保留零
		in.close();
	}

	public static int number(int num)
	{
		if(num>=10) 
			{
			number(num/10);
			}
		switch(num%10)
		{
			case 0:	System.out.print("ling");break;
			case 1:	System.out.print("yi");break;
			case 2:	System.out.print("er");break;
			case 3:	System.out.print("san");break;
			case 4:	System.out.print("si");break;
			case 5:	System.out.print("wu");break;
			case 6:	System.out.print("liu");break;
			case 7:	System.out.print("qi");break;
			case 8:	System.out.print("ba");break;
			case 9:	System.out.print("jiu");break;
		}
		if(num!=on)
		{
			System.out.print(" ");
		}
		return num;
	}
}
