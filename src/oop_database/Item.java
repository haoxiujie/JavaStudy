package oop_database;

public class Item {
//	protected String title;//标题
	//父类的private真的只有父类自己可以用，如果让子类也可以用，可以修改为protected.
	//protected可以让自己和子类以及同一个包内的其他类可以访问(3种都可以)。

	private String title;//标题
	private int playingTime;//播放时间
	private boolean gotIt;//存在标志
	private String comment;//备注
	
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		//通过在子类super();的括号中添加父类的构造内容，可以传给子类用来构造。
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public void print() {
		System.out.print(title);
	}


}
