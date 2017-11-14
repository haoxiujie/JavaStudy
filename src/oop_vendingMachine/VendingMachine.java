package oop_vendingMachine;

public class VendingMachine {
	int price = 80;//价格
	int balance = f();//当前余额
	int total;//合计 销量
	
	VendingMachine()	//	构造函数
//	构造函数：先调用构造函数，调用之后不进去直接去外面，
//	先去外面的定义初始化的地方，然后才进入构造函数。才完成类的初始化。
//	构造函数没有任何返回类型，名字必须与类的名字相同。
	{
		total = 0;
	}
	
	VendingMachine(int price)	//	构造函数	重载
//	可以有多个构造函数，但是参数表必须不一样，注意这个参数表是(int)
//	会根据new对象时候的参数表的样子(有多少个，每个是什么类型)，进入对应的构造函数
//	一个类里的同名但参数表不同的函数构成了重载关系。
	{
		this();//可以根据this的特殊用法，来调用另外一个构造函数，进入和this一样参数表的构造函数中。
		//但是↑这样的一句this只能在构造函数中出现，并且只能是构造函数的第一句，且只能调用一次。
		this.price = price;
	}
	
	int f()
	{
		return 10;
	}
	
	void setPrice(int price)//放入price
	{
		this.price = price;
	}
	
	void showPrompt() //显示提示
	{
		System.out.println("Welcome");
	}

	void insertMoney(int amount)//插入钱
	{
		balance = balance + amount;
		showBalance();
	}
	
	void showBalance() //显示当前余额
	{
		System.out.println(balance);
	}
	
	void getFood()//给食物
	{
		if ( balance >= price)
		{
			System.out.println("Here you are.");
			balance = balance - price;
			total = total + price;
		}
	}
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1 = new VendingMachine(99);
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
	}

}
