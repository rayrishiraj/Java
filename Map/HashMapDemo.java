package Map;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();

		h.put(1, "A");
		h.put(2, "B");
		h.put(3, "C");
		h.put(1, "D");
		h.put(4, null);
		h.put(5, "E");
		h.put(2, null);
		h.put(null, "A");
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		System.out.println(h.clone());
		System.out.println(h.entrySet());
	}
}
