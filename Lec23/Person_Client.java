package Lec23;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Person p = new Person("Kamlesh", 21);
//		System.out.println(p.name);
//		System.out.println(p.age);
		p.setName("Kamal");
		System.out.println(p.getName());
		Person p1 = new Person("Ankit", 21);
		p.setAge(-12);
		System.out.println(p.getAge());
		//p1.age = -12;
	}

}
