package basic;

class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("This is 1st thread");
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("This is 2nd thread");
	}
}

public class Thread_Example_2 {
	public static void main(String[] args) throws InterruptedException{
		
		MyThread1 a = new MyThread1();
		Thread.sleep(2000);
		a.start();
		
		MyThread2 b = new MyThread2();
		Thread.sleep(2000);
		b.start();
	
	}
}
