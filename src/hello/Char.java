package hello;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		char c = 'A';
		char d = (char)(c + 'a'-'A');
		System.out.println(d);
		
		in.close();
	}

}
