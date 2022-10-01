package question2.thread;

public class WelcomeThread implements Runnable {

	
	synchronized public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Welcome");
			try {
				Thread.sleep(4000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
