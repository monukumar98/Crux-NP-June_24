package Lec23;

public class Student {
	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {// raju
		System.out.println(this.name + " Say hey " + name);

	}

	public static void MentorName() {
		System.out.println("Monu bhaiya");
	}

	static {
		System.out.println("Welcome to Student class");
	}
	static {
		System.out.println("bklol to Student class");
	}
}










