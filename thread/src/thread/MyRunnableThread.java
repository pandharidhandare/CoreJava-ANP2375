package thread;

public class MyRunnableThread implements Runnable {
	public void run() {
		for(int i= 0;i<=5;i++) {
//			Thread t = Thread.currentThread();
			System.out.println(Thread.currentThread().getName()+"the thread execution");
		}
//		System.out.println(t.getNmae()+"My Thread is executed");
//		System.out.println(Thread.currentThread().getName()+"the thread execution");
	}

}
