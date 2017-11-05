package hello;

import java.util.Scanner;

public class ArrayPrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] primes = new int [50];
		primes[0] = 2;
		int cnt = 1;//两层意思：下个发现的素数放在prime[cnt]中；现在已经发现了cnt个素数。
		MAIN_LOOP:
		for ( int x = 3; cnt<50 ; x++)
		{
			for ( int i =0; i<cnt ; i++)
			{
				if( x % primes[i] == 0 ) {
					continue MAIN_LOOP;
				}
			}
			primes[cnt++] = x;
		}
		for ( int k : primes)
		{
			System.out.print(k+" ");
		}
		in.close();
	}

}
