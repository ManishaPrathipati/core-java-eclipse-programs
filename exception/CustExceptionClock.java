package exception;

import java.util.Scanner;

class TimeInCorrectException extends RuntimeException{
	
}
class Clock{
	private int hr, min, sec;

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) throws TimeInCorrectException{
		if(hr>=1 && hr<=12)
			this.hr = hr;
		else {
			try {
				throw new TimeInCorrectException();
			}
			catch(TimeInCorrectException tic) {
				System.out.println("Entered Hour is InCorrect");
			}
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) throws TimeInCorrectException {
		if(min>=0 && min<=59)
			this.min = min;
		else {
			try {
				throw new TimeInCorrectException();
			}
			catch(TimeInCorrectException tic) {
				System.out.println("Entered Minute is InCorrect");
			}
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) throws TimeInCorrectException {
		if(sec>=0 && sec<=59)
			this.sec = sec;
		else {
			try {
				throw new TimeInCorrectException();
			}
			catch(TimeInCorrectException tic) {
				System.out.println("Entered Second is InCorrect");
			}
		}
	}

	public Clock(int hr, int min, int sec) throws TimeInCorrectException {
		super();
		if((hr>=1 && hr<=12) && (min>=0 && min<=59) && (sec>=0 && sec<=59)) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		}
		else {
			try {
				throw new TimeInCorrectException();
			}
			catch(TimeInCorrectException tic) {
				System.out.println("Entered Values are InCorrect");
			}
		}
	}

	@Override
	public String toString() {
		return "Clock [hr=" + hr + ", min=" + min + ", sec=" + sec + "]";
	}
	
}
public class CustExceptionClock {

	static Clock c;
	public static void main(String[] args) throws TimeInCorrectException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Hour");
		int hr=scan.nextInt();
		System.out.println("Enter the Minute");
		int min=scan.nextInt();
		System.out.println("Enter the Second");
		int sec=scan.nextInt();
		try {
			c=new Clock(hr, min, sec);
			System.out.println(c);
		}
		catch(TimeInCorrectException tic) {
			System.out.println("Please Enter the time in Correct Manner");
		}

	}

}
