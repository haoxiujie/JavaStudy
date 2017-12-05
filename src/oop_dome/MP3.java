package oop_dome;

public class MP3 extends Item {
	private int capacity;
	//ÄÚ´æÈÝÁ¿

	public MP3(String title, int playingTime, boolean gotIt, String comment, int cc) {
		super(title, playingTime, gotIt, comment);
		this.capacity = cc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public void print() {
		System.out.print("VideoGame:");
		super.print();
		System.out.print(capacity);
	}

}
