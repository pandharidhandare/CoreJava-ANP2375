package question3.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " welcome to lamda expression thread");
        };new Thread(task3).start();
	}

}
