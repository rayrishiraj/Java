package Generics;

public class Shape<K, V> {
	private K key;
	public Shape(K key, V value) {
		this.key = key;
		this.value = value;
	}
	private V value;
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
}
