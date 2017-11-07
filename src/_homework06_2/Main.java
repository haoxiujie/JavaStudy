package _homework06_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String NMEA = in.nextLine();//����һ�����
		int utctime = 0;
		while(!NMEA.equals("END"))//����������һ�еĻ�
		{
			if(NMEA.startsWith("$GPRMC"))//�����ָ����䣬�����
			{
				String s = NMEA.substring(1, NMEA.indexOf("*"));
				//���õ���1��λ��(ȥ��$)����"*"���ڵ�λ��֮ǰ(����)���ַ���s
				int yh = s.charAt(0);
				for(int i=1; i<s.length();i++)
				{
					yh = yh ^ s.charAt(i);
				}
				yh = yh % 65536;
				String syh;
				syh = Integer.toHexString(yh);
				//�����ȡ��У��ֵ�������ȡ����е�У��ֵ
				String jy = NMEA.substring(NMEA.indexOf("*")+1);	//�õ���n��λ�õ�ĩβ��ȫ������
				if(jy.equals(syh))//���ֵ���
				{
					String stime = NMEA.substring(7,13);
					utctime = Integer.parseInt(stime);
				}
			}
			NMEA = in.nextLine();//����һ�����
		}
		//��utcʱ�任�ɱ���ʱ��
		int BJT; //BJT=UTC+800
		if(utctime>200000)
		{
			utctime -= 240000;
		}
		BJT= utctime+80000;
		int h = BJT / 10000;
		int m = BJT % 10000 / 100;
		int s = BJT % 100;
		if(h<10) 
		{
			System.out.print("0"+h);
		}
		else
		{
			System.out.print(h);
		}
		System.out.print(":"+m+":"+s);
		in.close();
	}

}
