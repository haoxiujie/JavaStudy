package hello;

import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		//Math��
		//abs ����ֵ
		//pow �ݴ�
		//random [0,1)�����
		//round ��������
		
		System.out.println(Math.abs(-12));
		System.out.println(Math.round(10.645));
		System.out.println(Math.random()*100);
		System.out.println(Math.pow(2,3.2));
	}

}
