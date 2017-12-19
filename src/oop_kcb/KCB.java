package oop_kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class KCB {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new KCBData());
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		frame.pack();//计算自己的大小
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//显示出来
	}

}
