package hello;

import java.util.Scanner;

public class ArrayTraversal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] data = {3, 2, 5, 7, 4, 9, 11, 34, 12, 28};
		int x = in.nextInt();
//		int loc = -1;
		boolean found = false;
//		for (int i=0; i<data.length; i++)
//		{
//			if ( x==data[i] )
//			{
//				loc = i;
//				break;
//			}
//		}
		
		for( int k :data)//FOR-EACH循环：对于数组data中的每一个元素，循环的每一轮把它拿出来，作为一个K.
		{//FOR-EACH循环特别适合于遍历数组的情况，相当于只读的，不能给数组进行赋值。
			if( k == x )
			{
				found = true;
				break;
			}
		}
		if ( found == true )
		{
			System.out.println(x+"在其中");
		}
		else
		{
			System.out.println(x+"不在其中");
		}
		
//		if( loc > -1)
//		{
//			System.out.println(x+"是第"+(loc+1)+"个");
//		}
//		else
//		{
//			System.out.println(x+"不在其中");
//		}

		in.close();
	}

}
