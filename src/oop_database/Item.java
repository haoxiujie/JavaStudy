package oop_database;

public class Item {
//	protected String title;//����
	//�����private���ֻ�и����Լ������ã����������Ҳ�����ã������޸�Ϊprotected.
	//protected�������Լ��������Լ�ͬһ�����ڵ���������Է���(3�ֶ�����)��

	private String title;//����
	private int playingTime;//����ʱ��
	private boolean gotIt;//���ڱ�־
	private String comment;//��ע
	
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		//ͨ��������super();����������Ӹ���Ĺ������ݣ����Դ��������������졣
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public void print() {
		System.out.print(title);
	}


}
