package basic;

class My_Thread implements Runnable{
	public void run() {
		System.out.println("This is a Thread");
	}
}

public class Runnable_Example {
	public static void main(String[] args) {
		
		My_Thread t1 = new My_Thread();
		Thread a = new Thread(t1);
		a.start();
	
	}
}
