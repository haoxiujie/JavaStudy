package _homework04_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();//�û��������߽�
		int m = in.nextInt();//�û�������ұ߽�
		int add = 0;//ʵʱ���µĺ�
		int count = 0;//������ǵ�count������
		for( int on=2; count<m; on++)//on�Ǵ�2��ʼ�㣬++
		{
			int isPrime = 1;//��ǣ������������
			for( int i = 2; i<on; i++)//��2��ʼ�㣬���ܲ�������
			{
				if ( on%i == 0)//���������
				{
					isPrime = 0;//��ô������Ƿ�����
					break;//�������forѭ��
				}
			}
			if (isPrime ==1)//��������������
			{
				count++;//������ǵ�count������
				if (count>=n) //������ڷ�Χ��
				{
					add = add + on;//�ӵ�add����
				}
			}
			
		}
		System.out.println(add);
		
		in.close();
	}

}
