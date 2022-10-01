package thread;

public class MainEThread {

	public static void main(String[] args)throws Exception {
		
	
	Mythread mt = new Mythread();
	mt.start();
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().join();
	System.out.println("Main method ends");
}}
