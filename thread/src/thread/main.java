package thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t1= new Thread(mrt,"Thread1");
		Thread t2 = new Thread(mrt,"Thread2");
		Thread t3 = new Thread(mrt,"Thread3");
		t1.start();
		t2.start();
		t3.start();
//		t1.start();
		

	}

}
