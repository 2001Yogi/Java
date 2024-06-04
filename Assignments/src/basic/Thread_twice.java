package basic;
class MyT extends Thread{
	@Override
	public void run() {
		System.out.println("This is 1st thread");
	}
}

public class Thread_twice {
public static void main(String[] args) throws InterruptedException{
		
		MyT a = new MyT();
		a.start();
		a.start();
	
	}
}
