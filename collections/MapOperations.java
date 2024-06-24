package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapOperations {

	public static void main(String[] args) {
		TreeMap<Integer, String> ht=new TreeMap<Integer, String>();
								ht.put(1, "Manisha");
								ht.put(2, "Mickey");
								ht.put(2, null);
								ht.put(5, "Daisy");
								ht.put(4, "Donald");
								
		System.out.println(ht);
		System.out.println(ht.get(4));
	}

}
