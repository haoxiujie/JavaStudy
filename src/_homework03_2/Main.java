package _homework03_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();//用户输入的数，那么最后一位数就是number%10
		int digit = 1;//数位
		int _2 = 0;
		
		for(;number>0;digit++ , number=number/10)
		{
			if(digit %2 == number%2) {
				_2 = _2 + (int)Math.pow(2,(digit-1));
			}
		}
		System.out.println(_2);
		
		in.close();
	}

}
