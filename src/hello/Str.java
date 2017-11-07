package hello;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
//		System.out.println(s);
//		System.out.println(s.equals("bye"));
		
//		String s1 = "abc";
//		String s2 = "abcd";
//		System.out.println(s1.compareTo(s2));
		
		String name = "0123456789ºº×Ö";
//		System.out.println(name.length());
		System.out.println(name.substring(2,4));
//		for( int i=0; i<name.length();i++)
//		{
//			System.out.println(name.charAt(i));
//		}
		
		in.close();
	}

}
