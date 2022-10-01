package threadsleep;

public class BulletinMain {
public static void main(String[] args) {
	
	String bullet1 [] = {  "NationalNew1","NationalNew2","NationalNew3"};
	String bullet2 [] = {  "InternationalNew1","InternationalNew2","InternationalNew3"};
	
	Thread t1 = new Thread (new BulletinRunnable(bullet2),"international");
	Thread t2 = new Thread (new BulletinRunnable(bullet1),"national");
	t1.start();
	t2.start();
	
	
}
	
	
}
