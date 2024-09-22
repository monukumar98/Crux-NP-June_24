package Lec23;

public class Person {
	private String name = "Kaju";
	private int age = 20;

//	public Person() {
//
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		if (age < 0) {

		}
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//
//	public Person(String name) {
//
//	}

}
