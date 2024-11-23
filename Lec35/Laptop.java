package Lec35;

public  class Laptop {
	int no_of_port;

	public final Mouse isMouse() {
		return new Wire_Mouse();
	}
	
}
