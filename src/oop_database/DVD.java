package oop_database;

public class DVD extends Item{
	private String director;//Ó°Æ¬µ¼ÑÝ
	
	public DVD(String title,String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.director = director;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
