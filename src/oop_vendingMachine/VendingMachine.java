package oop_vendingMachine;

public class VendingMachine {
	int price = 80;//�۸�
	int balance;//��ǰ���
	int total;//�ϼ� ����
	
	void showPrompt() //��ʾ��ʾ
	{
		System.out.println("Welcome");
	}

	void insertMoney(int amount)//����Ǯ
	{
		balance = balance + amount;
	}
	
	void showBalance() //��ʾ��ǰ���
	{
		System.out.println(balance);
	}
	
	void getFood()//��ʳ��
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
