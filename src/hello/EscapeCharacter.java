package hello;

import java.util.Scanner;

public class EscapeCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		常见的逃逸字符有：
//		\b -> 回退一格
//		\t -> 到下一个表格位
//		\n -> 换行
//		\r -> 回车
//		\" -> 双引号
//		\' -> 单引号
//		\\ -> 反斜杠本身
		System.out.println("abc\bd");
		System.out.println("abc\t123");
		System.out.println("a\t123");
		in.close();
	}

}
