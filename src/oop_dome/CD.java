package oop_dome;

public class CD extends Item{
	private String artist;//艺术家
	private int numofTracks;//音轨数量				<-②
	
	
	public CD(String title, String areist, int nomofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);//接收父类传过来的构造。<-①
		//子类必须有super(),没有这个的话就隐含认为有super()->不带参数的构造器;	
		//注意此时构造函数的顺序：
		//先做了①接收父类的构造,再②进行自己的定义初始化,才来做③进自己的构造函数。
		this.artist = artist;
		this.numofTracks = numofTracks;//			<-③
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
//		System.out.println(title+":"+artist);
		
	}

}
