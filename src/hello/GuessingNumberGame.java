package hello;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1); // [0,1) --> [0.100) --> [1,101)
		int a;
		int count = 0;
		do
		{
			a = in.nextInt();
			count = count + 1;
			if ( a > number)
			{
				System.out.println("ƫ��");
			}
			else if ( a < number)
			{
				System.out.println("ƫС");
			}
		}while ( a != number );
		System.out.println("��ϲ��¶��ˣ������"+count+"��");
		
		in.close();
	}

}
