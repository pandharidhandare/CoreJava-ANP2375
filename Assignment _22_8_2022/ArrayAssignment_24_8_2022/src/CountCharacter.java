
public class CountCharacter {
static int count =0;
static	void countchar( char a[]) {
	
		for (int i =0;i<a.length;i++) {
			count=0;
		
	for(int j=0;j<a.length;j++) {

		 if (a[i]==a[j]) {
			count++;
	
			
	}
	
	}System.out.println(a[i]+ " " +count);	
		}
		


}

	public static void main(String[] args) {
		
		char n[] = {'a','v','b','b','c','b','b'};
		countchar(n);
	}
}
