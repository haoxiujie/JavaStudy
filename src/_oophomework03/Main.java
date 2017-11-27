package _oophomework03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LookupMileage lms = new LookupMileage();
		//�����������
		int n = 0;
		String s = in.next();
		while(!s.equals("###")){
			if(s.equals("Huzhou")) {
				s = "Suzhou";
			}
			lms.add(s);
			n++;
			s = in.next();
			}
		//��������м�ľ���
		int [][]ns = new int [n][n];
		for(int i=0; i<ns.length; i++) {
			for(int j=0; j<ns[i].length; j++) {
				ns[i][j] = in.nextInt();
			}
		}
		
		//�������
		int looks = ns[lms.getmile(in.next())][lms.getmile(in.next())];
		System.out.println(looks);
		
		in.close();
	}

}

class LookupMileage{
	private HashMap<String, Integer> lm = new HashMap<String, Integer>();
	private int n = 0;
	
		
	public void add (String city){
		lm.put(city , n);
		n++;
	}
	
	public int getmile(String city) {
		return lm.get(city);
	}
}
