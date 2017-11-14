package oop_vendingMachine;

public class VendingMachine {
	int price = 80;//价格
	int balance;//当前余额
	int total;//合计 销量
	
	void showPrompt() //显示提示
	{
		System.out.println("Welcome");
	}

	void insertMoney(int amount)//插入钱
	{
		balance = balance + amount;
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
	}

}
