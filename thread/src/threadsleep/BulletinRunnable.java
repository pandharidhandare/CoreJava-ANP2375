package threadsleep;

public class BulletinRunnable implements Runnable {
	static Bulletin bullentin = new Bulletin();
	String bulletArray[];
	public BulletinRunnable(String textArray[]) {
		bulletArray =textArray;
		
	}
public void run() {
	bullentin.postBullentin(bulletArray);
}
}
