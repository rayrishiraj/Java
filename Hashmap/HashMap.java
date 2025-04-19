package Hashmap;

import java.util.LinkedList;
import java.util.Objects;

public class HashMap {
	private LinkedList<Node>[] buckets;
	private int n; // Number of Nodes
	private int N; // Number of Buckets

	public HashMap() {
		N = 4;
		buckets = new LinkedList[N];

		for (int i = 0; i < N; i++) {
			buckets[i] = new LinkedList<>();
		}
	}

	public void put(int key, String value) {
		int bi = hashfunction(key);
		int di = getDataIndex(bi, key);
		if (di != -1) { // Key is present
			buckets[bi].get(di).value = value;
		} else {
			buckets[bi].add(new Node(key, value));
			n++;
		}
		double lamda = (double) n / N;
		if (lamda > 2.0) {
			rehash();
		}
	}

	private void rehash() {
		LinkedList<Node> [] old = buckets;
		buckets = new LinkedList[N*2];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
		for(int i = 0; i < old.length; i++) {
			LinkedList<Node> list = old[i];
			for(int j = 0; j < list.size(); j++) {
				Node node = list.get(j);
				put(node.key, node.value);
			}
		}
		n = buckets.length;

	}

	private int getDataIndex(int bi, int key) {
		LinkedList<Node> list = buckets[bi];
		for (int i = 0; i < list.size(); i++) {
			Node node = list.get(i);
			if (node.key == key) {
				return i;
			}
		}
		return -1;
	}

	public int hashfunction(int key) {
		int hashCode = Objects.hash(key);
		hashCode = Math.abs(hashCode);
		return hashCode % buckets.length;
	}

	private class Node {
		int key;
		String value;

		public Node(int key, String value) {
			this.key = key;
			this.value = value;
		}

	}
}
