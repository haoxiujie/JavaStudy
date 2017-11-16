package oop_notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	//容器类有两个类型:容器的类型<元素的类型>
	//ArrayList类(范型类，是一种顺序容器 ，会自动顺序排列，删除一个自动向前移动角标，可以导出为数组。)
	
	public void add(String s) {
		//添加笔记
		notes.add(s);
		//ArrayList类的add函数，可以添加AL的元素类型的东西到AL容器中。
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
		//s加到location号前面去。即location是s的角标，后面的顺序向后移动。
	}
	
	public int getSize() {
		//查询数量 
		return notes.size();
		//ArrayList类的size函数，可以得到容器中的元素数量。
	}
	
	public String getNote(int index) {
		//查询笔记
		return notes.get(index);
		//ArrayList类的get函数，可以得到容器中的第index号东西，从0开始计数。
	}
	
	public void removeNote(int index) {
		//删除笔记
		notes.remove(index);
		//ArrayList类的remove函数,可以删掉index号位置的东西，返回值是刚刚删掉的东西。
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i=0; i<notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		//ArrayList类的toArray函数,相当于上面注释的代码，会自动把a给填起来，导出AL的内容，成为数组。
		return a;
	}

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		System.out.println(nb.getNote(2));
		nb.removeNote(1);
		String [] a = nb.list();
		for( String s : a ) {
			System.out.println(s);
		}
	}

}
