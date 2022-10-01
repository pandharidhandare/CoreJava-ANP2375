package threadsleep;

public class Bulletin {
	synchronized void postBullentin(String bulletPOints[]) {
//		synchronized(this){
		for(String  bullet : bulletPOints) {
			System.out.println(bullet);
			try {
				Thread.sleep(5000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
