package oop_hash;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	//HashMap��hash��(һ�����ݽṹ)����������һ��ֵ�Ž�ȥ��<��, ֵ>
	
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "��ë");//���ǵ�����
		System.out.println(coinnames.keySet().size());//keySet:��key����hashset����
		System.out.println(coinnames);
		for ( Integer k : coinnames.keySet()) {
			String s = coinnames.get(k);
			System.out.println("key="+k+",value="+s+".");
		}
	}
	
	public String getName(int amount) {
		if (coinnames.containsKey(amount))
			//containsKey�������ж��Ƿ����ָ���ļ���,��������true,���򷵻�flase.
			return coinnames.get(amount);
		else
			return "404 : NOT FOUNT";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
		in.close();
	}

}
