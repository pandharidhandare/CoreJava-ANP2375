package exercise2;

import java.util.HashMap;
import java.util.Map;

public class HashmapCountChar {
	static int count =0;
	static	void countchar( char a[]) {
		Map<Character,Integer> map = new HashMap<>();
			for (int i =0;i<a.length;i++) {
				count = 0;
		for(int j=0;j<a.length;j++) {
			
			 if (a[i]==a[j]) {
				count++;
			}
		}
			map.put(a[i],count);
			}
			System.out.println(map);


	}

		public static void main(String[] args) {
			
			char n[] = {'a','v','b','b'};
			countchar(n);
		}
	}

