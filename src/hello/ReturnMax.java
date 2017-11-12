package hello;

public class ReturnMax {
	public static int max(int a , int b)
	{
//		int ret;
		if ( a>b ) 
		{
//			ret = a;
			return a;
		}
		else
		{
//			ret = b;
			return b;
		}
//		return ret;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c;
		c = max(10,12);
		c = max(a,b);
		c = max(a,23);
		c = max(b,23);
		c = max(max(c,a),max(5,b));
		System.out.println(max(a,b));
		max(12,23);
	}

}
