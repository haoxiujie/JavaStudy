package oop_notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	//����������������:����������<Ԫ�ص�����>
	//ArrayList��(�����࣬��һ��˳������ �����Զ�˳�����У�ɾ��һ���Զ���ǰ�ƶ��Ǳ꣬���Ե���Ϊ���顣)
	
	public void add(String s) {
		//��ӱʼ�
		notes.add(s);
		//ArrayList���add�������������AL��Ԫ�����͵Ķ�����AL�����С�
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
		//s�ӵ�location��ǰ��ȥ����location��s�ĽǱ꣬�����˳������ƶ���
	}
	
	public int getSize() {
		//��ѯ���� 
		return notes.size();
		//ArrayList���size���������Եõ������е�Ԫ��������
	}
	
	public String getNote(int index) {
		//��ѯ�ʼ�
		return notes.get(index);
		//ArrayList���get���������Եõ������еĵ�index�Ŷ�������0��ʼ������
	}
	
	public void removeNote(int index) {
		//ɾ���ʼ�
		notes.remove(index);
		//ArrayList���remove����,����ɾ��index��λ�õĶ���������ֵ�Ǹո�ɾ���Ķ�����
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i=0; i<notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		//ArrayList���toArray����,�൱������ע�͵Ĵ��룬���Զ���a��������������AL�����ݣ���Ϊ���顣
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
