package oop_dome;

public class CD extends Item{
	private String artist;//������
	private int numofTracks;//��������				<-��
	
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);//���ո��ഫ�����Ĺ��졣<-��
		//���������super(),û������Ļ���������Ϊ��super()->���������Ĺ�����;	
		//ע���ʱ���캯����˳��
		//�����ˢٽ��ո���Ĺ���,�٢ڽ����Լ��Ķ����ʼ��,�������۽��Լ��Ĺ��캯����
		this.artist = artist;
		this.numofTracks = numofTracks;//			<-��
	}
	
	
	public static void main(String[] args) {
		
	}

	public void print() {
//		System.out.println(title+":"+artist);
		System.out.print("CD:");
		super.print();
		//���ø����print();Ҫ��super.print();
		System.out.println(":"+artist+" "+numofTracks);		
	}

}
