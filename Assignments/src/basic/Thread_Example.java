package basic;

class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("Thread is Running");
	}
}
public class Thread_Example {
public static void main(String[] args) {
		
		MyThread a = new MyThread();
		a.start();
	
	}
}
