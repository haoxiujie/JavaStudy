package oop_cells.cellmachine;

import javax.swing.JFrame;

import oop_cells.cell.Cell;
import oop_cells.field.Field;
import oop_cells.field.View;

public class CellMachine {
//field:网格(数据)      view:窗口(表现)      cell：细胞
	public static void main(String[] args) {
		Field field = new Field(30,30);
		//↑field:30*30网格
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		//↑row:行 col:列  遍历整个网格，在每一个row,col位置上放一个cell
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {
					cell.reborn();//reborn->重生，让大概五分之一的细胞活过来
				}
			}
		}//Math.random()->返回一个[0,1)之间的double随机数
		//↑再次遍历，判断如果随机数小于0.2
		//上面的部分是在准备数据
		View view = new View(field);//View:视图
		JFrame frame = new JFrame();//JFrame：Java中的GUI
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//让Frame
		frame.setResizable(false);//让Frame不可以改变大小
		frame.setTitle("Cells");//让Frame的标题是...
		frame.add(view);//让Frame加入刚才的view
		frame.pack();//让Frame自己决定大小
		frame.setVisible(true);//画出来这个东西
		//上面的部分是在准备view窗口
		for ( int i=0; i<1000; i++ ) {
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col);
					Cell[] neighbour = field.getNeighbour(row, col);
					int numOfLive = 0;
					for ( Cell c : neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) {
						cell.reborn();
						System.out.print("reborn");
					}
					System.out.println();
				}
			}
			System.out.println("UPDATE");
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
