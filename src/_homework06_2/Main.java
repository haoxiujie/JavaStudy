package _homework06_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String NMEA = in.nextLine();//读入一行语句
		int utctime = 0;
		while(!NMEA.equals("END"))//如果不是最后一行的话
		{
			if(NMEA.startsWith("$GPRMC"))//如果是指定语句，则操作
			{
				String s = NMEA.substring(1, NMEA.indexOf("*"));
				//↑得到从1号位置(去除$)到第"*"所在的位置之前(不含)的字符串s
				int yh = s.charAt(0);
				for(int i=1; i<s.length();i++)
				{
					yh = yh ^ s.charAt(i);
				}
				yh = yh % 65536;
				String syh;
				syh = Integer.toHexString(yh);
				//上面获取了校验值，下面获取语句中的校验值
				String jy = NMEA.substring(NMEA.indexOf("*")+1);	//得到从n号位置到末尾的全部内容
				if(jy.equals(syh))//如果值相等
				{
					String stime = NMEA.substring(7,13);
					utctime = Integer.parseInt(stime);
				}
			}
			NMEA = in.nextLine();//读下一条语句
		}
		//将utc时间换成北京时间
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
