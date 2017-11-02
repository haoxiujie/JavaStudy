package _homework02_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//BJT->UTC   UTC=BJT-800
		Scanner in = new Scanner(System.in);
		int BJT = in.nextInt();
		if ( BJT<800 )
		{
			BJT+=2400;
		}
		System.out.println(BJT-800);
		in.close();
	}

}
