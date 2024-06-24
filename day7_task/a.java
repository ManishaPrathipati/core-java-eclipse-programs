package day7_task;

public class a {

	private int i;
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getTime() {

		if(this.time>=00 && this.time <=24)
			return time;
		
		return time;

	}

	public void setTime(int time) {
		if(this.time>=00 && this.time <=24)
			this.time = time;
		else
			System.out.println("Time Format is Wrong"); 
	}

	private int j;
	private int time;
	
	a(int i, int time, int j){
		this.i=i;
		this.j=j;
		this.time=time;
	}
	
	public static void main(String[] args) {
		
		a a=new a(10,20,20);
		System.out.println(a.i);
		System.out.println(a.j);
			System.out.println(a.time);
		
	}
	
	
}

