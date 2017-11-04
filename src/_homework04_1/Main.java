package _homework04_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();//用户输入的左边界
		int m = in.nextInt();//用户输入的右边界
		int add = 0;//实时更新的和
		int count = 0;//这个数是第count个素数
		for( int on=2; count<m; on++)//on是从2开始算，++
		{
			int isPrime = 1;//标记，这个数是素数
			for( int i = 2; i<on; i++)//从2开始算，看能不能整除
			{
				if ( on%i == 0)//如果能整除
				{
					isPrime = 0;//那么这个数是非素数
					break;//跳出这个for循环
				}
			}
			if (isPrime ==1)//如果这个数是素数
			{
				count++;//这个数是第count个素数
				if (count>=n) //如果还在范围内
				{
					add = add + on;//加到add里面
				}
			}
			
		}
		System.out.println(add);
		
		in.close();
	}

}
