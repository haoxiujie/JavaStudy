package _homework06_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//用例2的情况是输入"This is a    ."应显示4 2 1而不是4 2 1 0
		Scanner in = new Scanner (System.in);
		String s = in.next();
		
		while(!s.endsWith("."))
		{	if(s.length()!=0)
			{
				System.out.print(s.length());
			}
			s = in.next();
			if(!s.equals(" ")&&!s.equals("."))
			{
				System.out.print(" ");
			}
		}
		if(s.length()!=1) 
		{
			System.out.print(s.length()-1);
		}
		in.close();
	}

}
