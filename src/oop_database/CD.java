package oop_database;

public class CD extends Item{
	private String title;//����
	private String artist;//������
	private int numofTracks;//��������
	private int playingTime;//����ʱ��
	private boolean gotIt = false;//���ڱ�־
	private String comment;//��ע
	
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
//		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.println(title+":"+artist);
		
	}

}
