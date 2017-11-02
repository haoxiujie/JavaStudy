package hello;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 100;
		while ( count > 0 )
		{
			System.out.println(count);
			count = count-1;
		}
		System.out.println("count="+count);
		System.out.println("·¢Éä! ");
		
		in.close();
	}

}
