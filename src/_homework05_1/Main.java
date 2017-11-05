package _homework05_1;

import java.util.Scanner;

public class Main {
	//这道题要考虑四种情况，就是题目中的用例1234
	//第一种情况是输出的结果第一个不能有+号
	//第二种情况是 0 0 0 0的情况，应当输出0
	//第三种情况是有可能系数为1的，应当显示为x而不是1x
	//第四种情况是有可能系数为-1的，应当显示为-x而不是-1x
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[]a = new int [101];
		int[]b = new int [101];
		int n;
		do {
			n=in.nextInt();
			a[n]=in.nextInt();
		}while(n!=0);
		do {
			n=in.nextInt();
			b[n]=in.nextInt();
		}while(n!=0);
		boolean no1 = true;
		for(int i=100;i>=0;i--)
		{
			if(a[i]+b[i]>0 && no1==false) 
			{
				System.out.print("+");
			}
			if( a[i]+b[i]!=0 && a[i]+b[i]!=1 && a[i]+b[i]!=-1)
			{
				if( i>1 )
				{
					System.out.print((a[i]+b[i])+"x"+i);
				}
				else if( i==1 )
				{
					System.out.print((a[i]+b[i])+"x");
				}
				else if( i==0 )
				{
					System.out.print((a[i]+b[i]));
				}
				no1 = false;
			}
			else if ( a[i]+b[i]==1) 
			{
				if( i>1 )
				{
					System.out.print("x"+i);
				}
				else if( i==1 )
				{
					System.out.print("x");
				}
				else if( i==0 )
				{
					System.out.print((a[i]+b[i]));
				}
				no1 = false;
			}
			else if ( a[i]+b[i]==-1) 
			{
				if( i>1 )
				{
					System.out.print("-x"+i);
				}
				else if( i==1 )
				{
					System.out.print("-x");
				}
				else if( i==0 )
				{
					System.out.print((a[i]+b[i]));
				}
				no1 = false;
			}
		}
		if(no1 == true)
		{
			System.out.print("0");
		}
		in.close();
	}

}
