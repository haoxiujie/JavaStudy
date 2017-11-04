package hello;

import java.util.Scanner;

public class ArrayMean {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		if (cnt>0)
		{
			int[] numbers = new int[cnt];
			for(int i = 0;i<numbers.length; i++)
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double average = sum/cnt;
			for (int i=0; i<numbers.length; i++)
			{
				if ( numbers[i] > average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(sum/cnt);
		}
		in.close();
	}

}
