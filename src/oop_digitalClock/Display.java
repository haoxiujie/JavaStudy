package oop_digitalClock;

//	һ������pubic�ģ������κ��˶������������Ķ����������������new�����������
//	����public���и�Ҫ����ǣ��ļ�����������������ͬ��
//	һ���ļ�(���뵥Ԫ)�����кܶ��࣬����ֻ��һ��������public�ġ�
public class Display {
	
//	private ˽�е� ���ڳ�Ա�����ͳ�Ա����ǰ��
//	˵�������Ա�������˽�еģ�ֻ����������ڲ����ܷ�������(�������Ĵ��������档)
	private int value = 0;//����ǰ��ֵ
	private int limit = 0;//����
	
//	public ������ �κ��˶����Է���
//	���캯��Ӧ����public��
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
