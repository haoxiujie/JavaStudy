package oop_digitalClock;

public class Display {
	private int value = 0;//（当前）值
	private int limit = 0;//上限
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Display d = new Display(24);
		for(;;) {
			d.increase();
			System.out.println(d.getValue());
		}
		
	}

}
