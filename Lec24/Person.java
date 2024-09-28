package Lec24;

public class Person {
	private String name = "Kaju";
	private int age = 20;

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
		try {
			if (age < 0) {
				throw new Exception("Bklol age -ve nhi hoga");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();

		} finally {

			System.out.println("I am in finally");
		}
	}

//	public void setAge(int age) throws Exception {
//	
//		if (age < 0) {
//			throw new Exception("Bklol age -ve nhi hoga");
//		}
//		this.age = age;
//	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
