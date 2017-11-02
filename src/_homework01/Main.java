package _homework01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		double f = 0;
//		double c = 0;
//		f=(9/5)*c+32	f->c	c=(f-32)*(5/9)
		f = in.nextInt();
		System.out.println((int)((f-32)*(5.0/9.0)));
		in.close();
	}

}
