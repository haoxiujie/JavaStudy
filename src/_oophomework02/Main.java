package _oophomework02;

public class Main {	
	public static void main(String[] args) {
	    java.util.Scanner in = new java.util.Scanner(System.in);
	    Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
	    clock.tick();
	    System.out.println(clock);
	    in.close();
	  }
}

class Display{
	private int value = 0;//（当前）值
	private int limit = 0;//上限
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	void newtime (int nt) {
		this.value= nt;
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
}

class Clock{
	private Display h = new Display(24);
	private Display m = new Display(60);
	private Display s = new Display(60);
	
	public Clock (int hour, int minute, int second) {
		h.newtime(hour);
		m.newtime(minute);
		s.newtime(second);		
	}
	
	public void start() {
		while(true) {
			s.increase();
			if( s.getValue() == 0 ) {
				if( m.getValue() == 0 ) {	
					h.increase();
				}
			}
			System.out.printf("%02d:%02d:%02d\n",h.getValue(),m.getValue(),s.getValue());
		}
	}
	
	public void tick() {
		s.increase();
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", h.getValue(),m.getValue(),s.getValue());
	}
}
