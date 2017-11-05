package _homework05_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = in.nextInt();
		int[][]board = new int[SIZE][SIZE];
//		boolean gotResult = true;//�ж��Ƿ��ʤ
		int numOfX = 0;//���ǲ��ǵ���SIZE ����Ǿ�Ӯ��
		int numOfO = 0;
		
		//	�������
		for (int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		OUT:
		if(numOfX!=SIZE || numOfO!=SIZE) {
			//�����
			for(int i=0; i<board.length;i++) 
			{
				for(int j=0; j<board[i].length;j++)
				{
					switch(board[i][j]) 
					{
						case 0:numOfO++;break;
						case 1:numOfX++;break;
					}
				}
				if(numOfX==SIZE||numOfO==SIZE)
				{
					break OUT;
				}
				else
				{
					numOfX = 0;
					numOfO = 0;
				}
			}
			
			//�����
			for(int j=0; j<board.length;j++) 
			{
				for(int i=0; i<board[j].length;i++)
				{
					switch(board[i][j]) 
					{
						case 0:numOfO++;break;
						case 1:numOfX++;break;
					}
				}
				if(numOfX==SIZE||numOfO==SIZE)
				{
					break OUT;
				}
				else
				{
					numOfX = 0;
					numOfO = 0;
				}
			}
			
			//���Խ���
			if(board[0][0]==0) 
			{
				numOfO = SIZE;
				for(int i=0; i<SIZE; i++) 
				{
					if(board[i][i]!=0) 
					{
						numOfO--;
						break;
					}
				}
				if(numOfO == SIZE) 
				{
					break OUT;
				}
			}
			if(board[0][0]==1) 
			{
				numOfX = SIZE;
				for(int i=0; i<SIZE; i++) 
				{
					if(board[i][i]!=1) 
					{
						numOfX--;
						break;
					}
				}
				if(numOfX == SIZE) 
				{
					break OUT;
				}
			}
			
			//���Խ���
			if(board[0][SIZE-1]==0) 
			{
				numOfO = SIZE;
				for(int i=0; i<SIZE; i++) 
				{
					if(board[i][SIZE-1-i]!=0) 
					{
						numOfO--;
						break;
					}
				}
				if(numOfO == SIZE) 
				{
					break OUT;
				}
			}
			if(board[0][SIZE-1]==1) 
			{
				numOfX = SIZE;
				for(int i=0; i<SIZE; i++) 
				{
					if(board[i][SIZE-1-i]!=1) 
					{
						numOfX--;
						break;
					}
				}
				if(numOfX == SIZE) 
				{
					break OUT;
				}
			}
			System.out.println("NIL");
		}
		if(numOfX==SIZE)
		{
			System.out.println("X");
		}
		if(numOfO==SIZE)
		{
			System.out.println("O");
		}
		in.close();
	}

}
