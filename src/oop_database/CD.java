package oop_database;

public class CD extends Item{
	private String title;//标题
	private String artist;//艺术家
	private int numofTracks;//音轨数量
	private int playingTime;//播放时间
	private boolean gotIt = false;//存在标志
	private String comment;//备注
	
	
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
