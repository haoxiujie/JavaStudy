package oop_vendingMachine;

public class VendingMachine {
	int price = 80;//�۸�
	int balance = f();//��ǰ���
	int total;//�ϼ� ����
	
	VendingMachine()	//	���캯��
//	���캯�����ȵ��ù��캯��������֮�󲻽�ȥֱ��ȥ���棬
//	��ȥ����Ķ����ʼ���ĵط���Ȼ��Ž��빹�캯�����������ĳ�ʼ����
//	���캯��û���κη������ͣ����ֱ��������������ͬ��
	{
		total = 0;
	}
	
	VendingMachine(int price)	//	���캯��	����
//	�����ж�����캯�������ǲ�������벻һ����ע�������������(int)
//	�����new����ʱ��Ĳ����������(�ж��ٸ���ÿ����ʲô����)�������Ӧ�Ĺ��캯��
//	һ�������ͬ����������ͬ�ĺ������������ع�ϵ��
	{
		this();//���Ը���this�������÷�������������һ�����캯���������thisһ��������Ĺ��캯���С�
		//���ǡ�������һ��thisֻ���ڹ��캯���г��֣�����ֻ���ǹ��캯���ĵ�һ�䣬��ֻ�ܵ���һ�Ρ�
		this.price = price;
	}
	
	int f()
	{
		return 10;
	}
	
	void setPrice(int price)//����price
	{
		this.price = price;
	}
	
	void showPrompt() //��ʾ��ʾ
	{
		System.out.println("Welcome");
	}

	void insertMoney(int amount)//����Ǯ
	{
		balance = balance + amount;
		showBalance();
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
		VendingMachine vm1 = new VendingMachine(99);
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
	}

}
