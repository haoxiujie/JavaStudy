package oop_dome;

public class DVD extends Item{
	private String director;//ӰƬ����
	
	public DVD(String title,String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.director = director;
	}

	public static void main(String[] args) {
		DVD dvd = new DVD("da","db",1,"..");
		dvd.print();

	}
	
	public void print( ) {
		System.out.print("DVD:");
		super.print();
		//���ø����print();Ҫ��super.print();
		System.out.println(":"+director);
	}

}
