package basic;
public class Daemon_Thread extends Thread{  
	 public void run(){  
	  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
	   System.out.println("daemon thread work");  
	  }  
	  else{  
	  System.out.println("user thread work");  
	 } 
	 }

	public static void main(String[] args){  
		Daemon_Thread t1=new Daemon_Thread();//creating thread  
		Daemon_Thread t2=new Daemon_Thread();  
		Daemon_Thread t3=new Daemon_Thread();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
}
