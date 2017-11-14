package _oophomework01;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Fraction a = new Fraction(in.nextInt(), in.nextInt());
    Fraction b = new Fraction(in.nextInt(),in.nextInt());
    a.print();
    b.print();
    a.plus(b).print();
    a.multiply(b).plus(new Fraction(5,6)).print();
    a.print();
    b.print();
    in.close();
  }

}

class Fraction {
	int a;
	int b;
	
	Fraction(int a ,int b)
	{	//����һ��a/b�ķ�����
		//��ʼ�������
		int m=a , n=b , r;
		do
		{
			r=m%n;
			m=n;
			n=r;
		}while(r!=0);
		//շת����������е���ʱm��a��b�����Լ����
		
		this.a = a/m;
		this.b = b/m;
	}
	
	double toDouble()
	{
		return (double)a/(double)b;
	}
	
	Fraction plus (Fraction r)
	{
		Fraction pl = new Fraction ((this.a*r.b + r.a*this.b),(this.b*r.b));
		return pl;
	}
	
	Fraction multiply (Fraction r)
	{
		Fraction mu = new Fraction ((this.a*r.a),(this.b*r.b));
		return mu;
	}
	
	void print()
	{
		if(b==1)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(a+"/"+b);
		}
	}
}
