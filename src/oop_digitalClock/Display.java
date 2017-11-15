package oop_digitalClock;

//	一个类是pubic的，表明任何人都可以用这个类的定义来定义变量。即new出这个类来。
//	但是public类有个要求就是，文件名必须和这个类名相同。
//	一个文件(编译单元)可以有很多类，但是只有一个类能是public的。
public class Display {
	
//	private 私有的 用于成员变量和成员函数前面
//	说明这个成员是这个类私有的，只有在这个类内部才能访问它。(即这个类的大括号里面。)
	private int value = 0;//（当前）值
	private int limit = 0;//上限
	
//	public 公开的 任何人都可以访问
//	构造函数应该是public的
	public Display(int limit) {
		this.limit = limit;
	}
	
	void increase() {
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
