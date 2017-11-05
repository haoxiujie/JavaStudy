package hello;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][]board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		//	读入矩阵
		for (int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		//检查行
		
		//检查列
		
		//检查对角线
		
		if (gotResult)
		{
			if(numOfX==SIZE)
			{
				
			}
			else
			{
				
			}
		}
	}

}
