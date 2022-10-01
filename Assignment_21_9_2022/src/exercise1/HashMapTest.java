package exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
		
 static void getValue(HashMap<Integer, String> hm) {


	
	for (Map.Entry<Integer, String>  m : hm.entrySet()) {
		
		System.out.println("Roll No :  " +m.getKey() +" and Name : "+m.getValue());
	}



 }
public static void main(String[] args) {
	
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"arvid");
	hm.put(3, "pandhari");
	hm.put(4, "rahul");
	hm.put(2, "Siddhant");
	hm.put(10,"arjun");
	hm.put(6, "rakesh");
	hm.put(8, "payal");
	hm.put(2, "sagar");
	HashMapTest.getValue(hm);
	}
}
