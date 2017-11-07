package hello;

import java.util.Scanner;

public class Integ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		int result = 0;
		do
		{
			int digit = number % 10;
			number = number / 10;
			result = result *10 + digit;
		} while( number > 0);
		System.out.println(result);
		
		in.close();
	}

}
