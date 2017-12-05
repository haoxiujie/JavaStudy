package oop_dome;

public class DVD extends Item{
	private String director;//影片导演
	
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
		//调用父类的print();要用super.print();
		System.out.println(":"+director);
	}

}
