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
		
		for( int k :data)//FOR-EACHѭ������������data�е�ÿһ��Ԫ�أ�ѭ����ÿһ�ְ����ó�������Ϊһ��K.
		{//FOR-EACHѭ���ر��ʺ��ڱ��������������൱��ֻ���ģ����ܸ�������и�ֵ��
			if( k == x )
			{
				found = true;
				break;
			}
		}
		if ( found == true )
		{
			System.out.println(x+"������");
		}
		else
		{
			System.out.println(x+"��������");
		}
		
//		if( loc > -1)
//		{
//			System.out.println(x+"�ǵ�"+(loc+1)+"��");
//		}
//		else
//		{
//			System.out.println(x+"��������");
//		}

		in.close();
	}

}
