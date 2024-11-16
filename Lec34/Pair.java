package Lec34;

public class Pair<K,V> {

	K x;
	V y;

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public Pair(K x, V y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p = new Pair<>();
		Pair<Character, Integer> p1 = new Pair<>();

	}
}
