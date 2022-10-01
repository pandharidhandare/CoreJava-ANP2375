package thread;

public class Mythread  extends Thread{
	public void run () {
		
		System.out.println(Thread.currentThread().getName() +  "The current Thread");
	}

}
