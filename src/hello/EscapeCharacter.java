package hello;

import java.util.Scanner;

public class EscapeCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		�����������ַ��У�
//		\b -> ����һ��
//		\t -> ����һ�����λ
//		\n -> ����
//		\r -> �س�
//		\" -> ˫����
//		\' -> ������
//		\\ -> ��б�ܱ���
		System.out.println("abc\bd");
		System.out.println("abc\t123");
		System.out.println("a\t123");
		in.close();
	}

}
